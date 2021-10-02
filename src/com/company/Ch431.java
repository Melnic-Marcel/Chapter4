package com.company;

import java.util.Scanner;

public class Ch431{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int binary = 0;
        int decimal = 0;
        int place = 0;

        System.out.print("Enter binary number for conversion: ");
        binary = sc.nextInt();

        while(binary != 0){

            int lastDigit = binary % 10;

            decimal += lastDigit * Math.pow(2, place);

            binary /= 10;

            place++;
        }

        System.out.printf("%d = %d\n", binary, decimal);
    }
}