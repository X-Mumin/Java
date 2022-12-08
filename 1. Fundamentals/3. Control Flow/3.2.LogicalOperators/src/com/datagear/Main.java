package com.datagear;

public class Main {

    public static void main(String[] args) {
	// write your code here

        boolean hasHighIncome = false;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;

        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;

        System.out.println(isEligible);
    }
}
