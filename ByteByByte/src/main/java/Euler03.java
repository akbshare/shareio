public class Euler03 {
    public static void main(String[] args) {
        System.out.println(largestPrimeFactor(600851475143l));
    }

    private static Long largestPrimeFactor(long n) {
        if(isPrime(n)) return n;
        long largest = -1;
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i == 0 && isPrime(i)){
                largest = i;
            }
        }
        return largest;
    }

    private static boolean isPrime(long n) {
        if(n%2 == 0){
            return false;
        }
        for(int i=3;i<n;i+=2){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
