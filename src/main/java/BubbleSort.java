public class BubbleSort {
    public static void main(String[] args){
        int[] input = {4,9,2,0,1,8,3,6,5};
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
            for(int j=0; j+1<input.length-i; j++){
                if(input[j] > input[j+1]){
                    int temp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = temp;
                }
            }
        }
    }
}
