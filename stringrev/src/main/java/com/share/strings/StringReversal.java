package com.share.strings;

public class StringReversal {
    public static void main(String[] args) {
        System.out.println(reverse("micromax"));
    }
    public static String reverse(String str){
        if(str == null || str.isEmpty()){
            return str;
        }
        char[] characters = str.toCharArray();
        int i=0;
        int j=characters.length-1;
        while(i<j){
            swap(characters,i,j);
            i++;
            j--;
        }
        return new String(characters);
    }

    private static void swap(char[] characters, int i, int j) {
        char temp = characters[i];
        characters[i] = characters[j];
        characters[j] = temp;
    }
}
