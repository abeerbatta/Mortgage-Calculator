package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Principal: ");
        double principal = scanner.nextDouble();

        System.out.println("Annual Interest Rate: ");
        double annualInterest = scanner.nextDouble();

        System.out.println("Period(Years): ");
        int period = scanner.nextInt();

        double monthlyInterest = annualInterest/(MONTHS_IN_YEAR*PERCENT);
        int periodMonthly = period*MONTHS_IN_YEAR;
        double numerator = monthlyInterest*Math.pow((1+monthlyInterest),periodMonthly);
        double denominator = Math.pow((1+monthlyInterest),periodMonthly) - 1 ;
        double mortgage =  (principal * numerator)/denominator ;
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);

    }
}
