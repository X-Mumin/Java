package com.datagear;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    final static byte PERCENT = 100;
    final static byte MONTHS_IN_YEAR = 12;

    public static void main(String[] args) {
        // write your code here
        int principle = (int) readNumber("Principle", 1_000, 1_000_000);
        float annualInterest = (float) readNumber("Annual Interest Rate", 1, 30);
        byte years = (byte) readNumber("Period (Years)", 1, 30);

        printMortgage(principle, annualInterest, years);
        printPaymentSchedule(principle, annualInterest, years);
    }

    private static void printMortgage(int principle, float annualInterest, byte years) {
        double mortgage = calculateMortgage(principle, annualInterest, years);
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println(
                "Monthly Payments: " + NumberFormat.getCurrencyInstance().format(mortgage)
                + "\n");
    }

    private static void printPaymentSchedule(int principle, float annualInterest, byte years) {
        System.out.println("\nPAYMENT SCHEDULE");
        System.out.println("----------------");
        double balance;
        for (short numberOfPaymentsMade = 0;
             numberOfPaymentsMade <= (years * MONTHS_IN_YEAR); numberOfPaymentsMade++) {
            balance =
                    calculateBalance(principle, annualInterest, years,
                                     numberOfPaymentsMade);

            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }

    public static double readNumber(String prompt, double min, double max) {
        Scanner scanner = new Scanner(System.in);
        double value;

        while (true) {
            System.out.print(prompt + ": ");
            value = scanner.nextDouble();
            if (value >= min && value <= max) {
                break;
            }
            System.out.println("Enter a number between " + min + ", and " + max);
        }
        return value;
    }

    public static double calculateBalance(int principle, float annualInterest, byte years,
                                          short numberOfPaymentsMade) {
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        short numberOfPayments = (short) (years * MONTHS_IN_YEAR);

        return principle * (Math.pow(1 + monthlyInterest, numberOfPayments) - Math.pow(
                1 + monthlyInterest, numberOfPaymentsMade)) / (Math.pow(
                1 + monthlyInterest, numberOfPayments) - 1);
    }


    public static double calculateMortgage(int principle, float annualInterest,
                                           byte years) {
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        short numberOfPayments = (short) (years * MONTHS_IN_YEAR);
        float x = (float) Math.pow((1 + monthlyInterest), numberOfPayments);

        return principle * ((monthlyInterest * x) / (x - 1));
    }
}