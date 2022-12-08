package com.datagear;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {
	// write your code here
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.println(currency.format(1234567.891));

        System.out.println(NumberFormat.getPercentInstance().format(0.1));
    }
}
