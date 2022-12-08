package com.datagear;

public class MortgageCalculator {
    public final static byte PERCENT = 100;
    public final static byte MONTHS_IN_YEAR = 12;

    private int principle;
    private float annualInterest;
    private byte years;

    public MortgageCalculator(int principle, float annualInterest, byte years) {
        this.principle = principle;
        this.annualInterest = annualInterest;
        this.years = years;
    }

    protected MortgageCalculator(){}

    public double calculateMortgage() {
        float monthlyInterest = getMonthlyInterest();
        short numberOfPayments = getNumberOfPayments();
        float x = (float) Math.pow((1 + monthlyInterest), numberOfPayments);

        return principle * ((monthlyInterest * x) / (x - 1));
    }

    public double calculateBalance(short numberOfPaymentsMade) {
        float monthlyInterest = getMonthlyInterest();
        short numberOfPayments = getNumberOfPayments();

        return principle * (Math.pow(1 + monthlyInterest, numberOfPayments) -
                Math.pow(1 + monthlyInterest, numberOfPaymentsMade)) /
                (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    }

    public double[] getRemainingBalances() {
        double[] balances = new double[getNumberOfPayments()];
        for (short numberOfPaymentsMade = 0;
             numberOfPaymentsMade < balances.length; numberOfPaymentsMade++) {
            System.out.println("number of payment: "+ numberOfPaymentsMade);
            balances[numberOfPaymentsMade] =
                    calculateBalance(numberOfPaymentsMade);
        }
        return balances;
    }



    private short getNumberOfPayments() {
        return (short) (years * MONTHS_IN_YEAR);
    }

    private float getMonthlyInterest() {
        return annualInterest / PERCENT / MONTHS_IN_YEAR;
    }
}
