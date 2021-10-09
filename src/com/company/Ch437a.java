package com.company;
import java.util.Scanner;

public class Ch437a {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n;
        int x;
        int r = 1;
        System.out.printf("Enter the number: ");
        n = scan.nextInt();
        while (n>0)
        {
            r = r *n;
            n--;
        }
        System.out.printf(""+r);

    }

}