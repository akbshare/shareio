package com.share.primes;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int number = Integer.MAX_VALUE;
        while(number!=0){
            number = scnr.nextInt();
            System.out.println(isPrime(number));
        }
    }

    private static boolean isPrime(int number) {
        int sqrt = (int)Math.sqrt(number) + 1;
        for(int i=2;i<sqrt;i++){
            if(number%i == 0){
                return false;
            }
        }
        return true;
    }
}
