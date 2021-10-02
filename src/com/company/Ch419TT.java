package com.company;
import java.util.Scanner;
public class Ch419TT {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Ch419 salesCal = new Ch419();
        int item = 0;
        while(item != 5){
            System.out.print("Enter the number(1-4) of the item sold (Enter 5 to exit): ");
            item = sc.nextInt();
            salesCal.enterItem(item);
        }
        if(salesCal.getSalesTotal() > 0){

            System.out.printf("Weekly sales total: %.2f\n", salesCal.getSalesTotal());
            System.out.printf("Weekly earnings: %.2f\n", salesCal.calculateCommission());

        }
    }
}
