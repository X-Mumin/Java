package com.datagear;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        final byte MONTHS_IN_YEAR = 12;
        final short MIN_PRINCIPLE = 1_000;
        final int MAX_PRINCIPLE = 1_000_000;
        final byte PERCENT = 100;
        final float MIN_MONTHLY_INTEREST_RATE = 0F / PERCENT / MONTHS_IN_YEAR;
        final float MAX_MONTHLY_INTEREST_RATE = 30F / PERCENT / MONTHS_IN_YEAR;
        final byte MIN_YEARS = 1;
        final byte MAX_YEARS = 30;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal ($1K - $1M): ");
        int p = scanner.nextInt();
        while (!(p > MIN_PRINCIPLE && p < MAX_PRINCIPLE)) {
            System.out.print("Enter a value between " + NumberFormat.getCurrencyInstance()
                                                                    .format(MIN_PRINCIPLE) + " and " + NumberFormat.getCurrencyInstance()
                                                                                                                   .format(MAX_PRINCIPLE) + ": ");
            p = scanner.nextInt();
        }

        System.out.print("Annual Interest Rate (0% - 30%): ");
        float monthlyInterest = scanner.nextFloat() / PERCENT / MONTHS_IN_YEAR;
        while (!(monthlyInterest > MIN_MONTHLY_INTEREST_RATE && monthlyInterest < MAX_MONTHLY_INTEREST_RATE)) {
            System.out.print("Enter a value between " + NumberFormat.getPercentInstance()
                                                                    .format(MIN_MONTHLY_INTEREST_RATE * PERCENT * MONTHS_IN_YEAR) + " and " + NumberFormat.getPercentInstance()
                                                                                                                                                          .format(MAX_MONTHLY_INTEREST_RATE * PERCENT * MONTHS_IN_YEAR) + ": ");
            monthlyInterest = scanner.nextFloat() / PERCENT / MONTHS_IN_YEAR;
        }

        System.out.print("Period (Years) (1Y - 30Y): ");
        short numberOfPayments = (short) (scanner.nextShort() * MONTHS_IN_YEAR);
        while (!(numberOfPayments > (MIN_YEARS * MONTHS_IN_YEAR) && numberOfPayments < (MAX_YEARS * MONTHS_IN_YEAR))) {
            System.out.print(
                    "Enter a value between " + MIN_YEARS + " and " + MAX_YEARS + ": ");
            numberOfPayments = (short) (scanner.nextShort() * MONTHS_IN_YEAR);
        }

        float x = (float) Math.pow((1 + monthlyInterest), numberOfPayments);
        float mortgage = p * ((monthlyInterest * x) / (x - 1));

        System.out.println(
                "Mortgage: " + NumberFormat.getCurrencyInstance().format(mortgage));
    }
}