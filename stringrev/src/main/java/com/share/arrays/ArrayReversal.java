package com.share.arrays;

import java.util.Arrays;

public class ArrayReversal {
    public static void main(String[] args) {
        String[] names = {"David Warner","Steven Smith","Mitchel Starc","Patrick Cummins"};
        System.out.println("Original Array :"+ Arrays.toString(names));
        reverse(names);
        System.out.println("Reversed Array :"+ Arrays.toString(names));
    }

    private static void reverse(String[] names) {
        if(names == null || names.length < 2){
            return;
        }
        for(int i=0;i<names.length/2;i++){
            String temp = names[i];
            names[i] = names[names.length-1-i];
            names[names.length-1-i]=temp;
        }
    }
}
