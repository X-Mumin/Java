package com.datagear;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] numbers = {2, 3, 5, 1, 4};
        System.out.println(numbers.length);
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
