public class TestSelectionSort {
    public static void main(String[] args){
        int[] input = {4,9,2,0,5,1,7,3,8};
        sortInput(input);
        displayInput(input);
    }

    private static void displayInput(int[] input) {
        for(int i:input){
            System.out.print(i+", ");
        }
    }

    private static void sortInput(int[] input) {
        for(int i=0; i<input.length-1; i++){
            int indexOfSmallest = i;
            for(int j=i+1; j<input.length; j++){
                if(input[j] < input[indexOfSmallest]){
                    indexOfSmallest = j;
                }
            }
            int temp = input[i];
            input[i] = input[indexOfSmallest];
            input[indexOfSmallest] = temp;
        }
    }
}
