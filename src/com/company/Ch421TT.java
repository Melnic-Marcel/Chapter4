package com.company;
import java.util.Scanner;

class Ch421TT
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Ch421 ln = new Ch421();

        for(int i=0; i<10; i++){
            System.out.printf("%d/10. Enter a number: ", i+1);
            ln.enterNumber(sc.nextInt());
        }
        System.out.printf("The largest number is: %d\n", ln.getLargestNumber());
    }
}

