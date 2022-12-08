package com.datagear;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // implicit / automatic casting
        // byte > short > int > long > float > double
        String x = "1.5";

        float y = Float.parseFloat(x) + 2;   // 2.0

        System.out.println(Float.parseFloat(x) + y);
    }
}
