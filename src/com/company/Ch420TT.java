package com.company;
import java.util.Scanner;
public class Ch420TT {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Ch420 salaryCalc = new Ch420();

        for(int i=1; i<4; i++){
            System.out.printf("Employee %d weekly hours: ", i);
            salaryCalc.setHours(scan.nextDouble());

            System.out.printf("Employee %d hourly pay: ", i);
            salaryCalc.setHourlyPay(scan.nextDouble());

            System.out.printf("Employee %d gross pay: %.2f\n", i, salaryCalc.calculateGPay());
        }
    }
}
