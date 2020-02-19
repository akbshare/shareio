public class RecursionTest {
    public static void main(String[] args){
        System.out.println("The Factorial of 5 is :"+factorial(5));
    }

    private static int factorial(int i) {
        if(i <= 1){
            return 1;
        } else {
            return i * factorial(i-1);
        }
    }
}
