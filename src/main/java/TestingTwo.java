public class TestingTwo {
    public static void main(String[] args){
        int[] someArray = {0,9,1,8,2,7,3,6,4,5};
        testArray(someArray);
        showArray(someArray);
    }

    private static void testArray(int[] someArray) {
        for(int i=0; i<someArray.length-1; i++){
            for(int j=0; j+1<someArray.length-i; j++){
                if(someArray[j] > someArray[j+1]){
                    int temp = someArray[j];
                    someArray[j] = someArray[j+1];
                    someArray[j+1] = temp;
                }
            }
        }
    }

    private static void showArray(int[] someArray) {
        for(int i:someArray){
            System.out.print(i+", ");
        }
    }
}
