package com.datagear;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(greetUser("Mu'min", "Ahmad"));
    }

    public static String greetUser(String firstName, String lastName){
        return ("Hello " + firstName + " " + lastName + "!");
    }
}
