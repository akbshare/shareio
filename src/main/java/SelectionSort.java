public class SelectionSort {
    public static void main(String[] args){
        int[] input = {10,40,20,60,50,30,90,80,70};

        selectionSort(input);
        
        printArray(input);
    }

    private static void printArray(int[] input) {
        for(int i : input) {
            System.out.print(i+",");
        }
    }

    private static void selectionSort(int[] input) {
        for(int i=0; i<input.length-1; i++) {
            int indexOfSmallest = i;
            for(int j=i+1; j<input.length; j++) {
                if(input[j] < input[indexOfSmallest]) {
                    indexOfSmallest = j;
                }
            }
            int temp = input[i];
            input[i] = input[indexOfSmallest];
            input[indexOfSmallest] = temp;
        }
    }
}
