public class TestingOne {
    public static void main(String[] args){
        int[] someArray = {0,8,1,9,2,7,3,6,4,5};
        testList(someArray);
        displayList(someArray);
    }

    private static void testList(int[] someArray) {
        for(int i=0;i<someArray.length-1;i++){
            int indexOfMax = i;
            for(int j=i+1;j<someArray.length;j++){
                if(someArray[j]>someArray[indexOfMax]){
                    indexOfMax = j;
                }
            }
            int temp = someArray[i];
            someArray[i] = someArray[indexOfMax];
            someArray[indexOfMax] = temp;
        }
    }

    private static void displayList(int[] someArray) {
        for(int i:someArray){
            System.out.print(i+", ");
        }
    }

}
