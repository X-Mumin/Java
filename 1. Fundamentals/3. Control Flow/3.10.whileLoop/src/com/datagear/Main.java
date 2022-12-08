package com.datagear;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String input = "";
        Scanner scanner = new Scanner(System.in);
        while (!input.equalsIgnoreCase("quit")) {
            System.out.print("Input: ");
            input = scanner.next();
            System.out.println(input);
        }
    }
}
