package com.share.arrays;

import java.util.Arrays;

public class MaxMinArrayDemo {
    public static void main(String[] args) {
        largestAndSmallest(new int[]{-10,10,20,5,-20,50});
    }

    private static void largestAndSmallest(int[] ints) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i:ints){
            if(i > largest){
                largest = i;
            } else if(i < smallest){
                smallest = i;
            }
        }
        System.out.println("Given number :"+ Arrays.toString(ints));
        System.out.println("Largest Number is :"+largest);
        System.out.println("Smallest Number is :"+smallest);
    }
}
