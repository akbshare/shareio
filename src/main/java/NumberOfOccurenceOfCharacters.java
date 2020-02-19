public class NumberOfOccurenceOfCharacters {
    static final int MAX_CHAR = 256;
    public static void main(String[] args) {
        String str = "akbar shareef";
        getOccuringChar(str);
    }

    private static void getOccuringChar(String str) {
        int count[] = new int[MAX_CHAR];
        int len = str.length();

        for(int i=0;i<len;i++){
            count[str.charAt(i)]++;
            System.out.println(str.charAt(i)+"::"+count[str.charAt(i)]);
        }

        /*char ch[] = new char[str.length()];
        for(int i=0;i<len;i++){
            ch[i] = str.charAt(i);
            int find = 0;
            for(int j=0;j<=i;j++){
                if(str.charAt(i) == ch[j]){
                    find++;
                }
            }
            if(find ==1){
                System.out.println("No. of occurence of :"+str.charAt(i)+" is :"+count[str.charAt(i)]);
            }
        }*/
    }
}
