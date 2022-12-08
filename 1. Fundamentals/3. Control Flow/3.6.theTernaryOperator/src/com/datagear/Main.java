package com.datagear;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int income = 120_000;
        String className = (income > 100_000 ? "First" : "Economy");

        System.out.println(className);
    }
}
