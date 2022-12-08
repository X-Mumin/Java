package com.datagear;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String input = "";
        Scanner scanner = new Scanner(System.in);

        boolean breakFlag = false;
        while (!breakFlag) {
            System.out.print("Input: ");
            input = scanner.next();
            if (input.equalsIgnoreCase("quit")) {
                breakFlag = true;
                continue;
            } else if (input.equalsIgnoreCase("pass")) {
                continue;
            }
            System.out.println(input);
        }
    }
}