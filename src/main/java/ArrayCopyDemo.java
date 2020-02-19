public class ArrayCopyDemo {
    public static void main(String[] args) {
        int source[] = {10,12,15,20,24,27,30};
        int destination [] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Output is :");
        System.arraycopy(source,1,destination,0,4);
        for(int i:destination)
        System.out.print(i+", ");
    }
}
