package com.datagear;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int p = scanner.nextInt();
        System.out.print("Annual Interest Rate: ");
        float monthlyInterest = scanner.nextFloat() / PERCENT / MONTHS_IN_YEAR;
        System.out.print("Period (Years): ");
        short numberOfPayments = (short) (scanner.nextShort() * MONTHS_IN_YEAR);

        float x = (float) Math.pow((1+monthlyInterest), numberOfPayments);
        float mortgage = (float) (p * ((monthlyInterest * x) / (x - 1)));

        System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(mortgage));
    }
}
