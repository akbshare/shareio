public class Euler01 {
    public static void main(String[] args) {
        System.out.println(multiplesOf3And5(1000));
    }

    private static Integer multiplesOf3And5(int n) {
        int sum = 0;
        for(int i=0;i<n;i++){
            if(i%3 == 0 || i%5 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}
