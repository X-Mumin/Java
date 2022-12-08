package com.datagear;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        short n = scanner.nextShort();

        if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (n % 3 == 0) {
            System.out.println("Buzz");
        } else if (n % 5 == 0) {
            System.out.println("Fizz");
        } else {
            System.out.println(n);
        }
    }
}
