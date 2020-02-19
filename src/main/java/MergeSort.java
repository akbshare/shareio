import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args){
        int[] a = {2,6,3,5,1,4};
        mergeSort(a);
        System.out.println(Arrays.toString(a));
    }

    private static void mergeSort(int[] a) {
        if(a.length > 1){
            int[] first = new int[a.length / 2];
            int[] second = new int[a.length - first.length];

            System.arraycopy(a,0,first,0,first.length);
            System.arraycopy(a,first.length,second,0,second.length);

            mergeSort(first);
            mergeSort(second);

            merge(first,second,a);
        }
    }

    private static void merge(int[] first, int[] second, int[] a) {
        int indexOfFirst = 0;
        int indexOfSecond = 0;
        int indexOfMerged = 0;
        while(indexOfFirst < first.length && indexOfSecond < second.length) {
            if(first[indexOfFirst] < second[indexOfSecond]){
                a[indexOfMerged] = first[indexOfFirst];
                indexOfFirst++;
            } else {
                a[indexOfMerged] = second[indexOfSecond];
                indexOfSecond++;
            }
            indexOfMerged++;
        }

        System.arraycopy(first,indexOfFirst,a,indexOfMerged,first.length-indexOfFirst);
        System.arraycopy(second,indexOfSecond,a,indexOfMerged,second.length-indexOfSecond);
    }
}
