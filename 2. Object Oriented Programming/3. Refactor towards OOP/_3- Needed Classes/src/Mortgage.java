import java.text.NumberFormat;

public class Mortgage {
    final static byte PERCENT = 100;
    final static byte MONTHS_IN_YEAR = 12;
    private float annualInterest;
    private int principle;
    private byte years;

    public Mortgage() {
        setPrinciple();
        setAnnualInterest();
        setYears();
    }

    public int getPrinciple() {
        return principle;
    }

    public void setPrinciple() {
        this.principle = (int) Console.readNumber("Principle", 1_000, 1_000_000);
    }

    public float getAnnualInterest() {
        return annualInterest;
    }

    public void setAnnualInterest() {
        this.annualInterest = (float) Console.readNumber("Annual Interest Rate", 1, 30);
    }

    public byte getYears() {
        return years;
    }

    public void setYears() {
        this.years = (byte) Console.readNumber("Period (Years)", 1, 30);
    }

    private double calculate() {
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        short numberOfPayments = (short) (years * MONTHS_IN_YEAR);
        float x = (float) Math.pow((1 + monthlyInterest), numberOfPayments);

        return principle * ((monthlyInterest * x) / (x - 1));
    }

    public void print() {
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " +
                NumberFormat.getCurrencyInstance().format(calculate()) + "\n");
    }

    private double balance(short numberOfPaymentsMade) {
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        short numberOfPayments = (short) (years * MONTHS_IN_YEAR);

        return principle * (Math.pow(1 + monthlyInterest, numberOfPayments) -
                Math.pow(1 + monthlyInterest, numberOfPaymentsMade)) /
                (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    }

    public void paymentSchedule() {
        System.out.println("\nPAYMENT SCHEDULE");
        System.out.println("----------------");
        double balance;
        for (short numberOfPaymentsMade = 0;
             numberOfPaymentsMade <= (years * MONTHS_IN_YEAR);
             numberOfPaymentsMade++) {
            balance = balance(numberOfPaymentsMade);

            System.out.println(
                    NumberFormat.getCurrencyInstance().format(balance));
        }
    }
}