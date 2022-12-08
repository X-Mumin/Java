package com.datagear;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int temp = 20;

        if (temp > 30) {
            System.out.println("It's a hot day");
            System.out.println("Drink some water");
        } else if (temp > 20 && temp <= 30) {
            System.out.println("Beautiful day!");
        } else {
            System.out.println("Cold day!");
        }
    }
}
