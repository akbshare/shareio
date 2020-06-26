public class Euler02 {
    public static void main(String[] args) {
        System.out.println(sumOfEvenValuesInFib(4000000));
    }

    private static Integer sumOfEvenValuesInFib(int n) {
        int firstValue = 1;
        int secondValue = 2;
        int result = secondValue;
        while(secondValue <= n){
            int temp = firstValue;
            firstValue = secondValue;
            secondValue = temp + secondValue;
            if(secondValue %2 == 0){
                result = result + secondValue;
            }
        }
        return result;
    }
}
