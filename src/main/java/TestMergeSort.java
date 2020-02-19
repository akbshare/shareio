import java.util.Arrays;

public class TestMergeSort {
    public static void main(String[] args){
        int[] list = {-1,1,2,-2,-3,3,-4,4,-5,5,-6,6,-7,7,-8,8};
        mergeSort(list);
        System.out.println(Arrays.toString(list));
    }

    private static void mergeSort(int[] list) {
        if(list.length > 1){
            int[] first = new int[list.length / 2];
            int[] second = new int[list.length - first.length];

            System.arraycopy(list,0,first,0,first.length);
            System.arraycopy(list,first.length,second,0,second.length);

            mergeSort(first);
            mergeSort(second);

            merge(first,second,list);
        }
    }

    private static void merge(int[] first, int[] second, int[] list) {
        int indexOfFirst = 0;
        int indexOfSecond = 0;
        int indexOfMerged = 0;

        while(indexOfFirst < first.length && indexOfSecond < second.length) {
            if(first[indexOfFirst] < second[indexOfSecond]){
                list[indexOfMerged] = first[indexOfFirst];
                indexOfFirst++;
            } else {
                list[indexOfMerged] = second[indexOfSecond];
                indexOfSecond++;
            }
            indexOfMerged++;
        }

        System.arraycopy(first,indexOfFirst,list,indexOfMerged,first.length-indexOfFirst);
        System.arraycopy(second,indexOfSecond,list,indexOfMerged,second.length-indexOfSecond);
    }
}
