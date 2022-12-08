package datagear;

import static datagear.Console.readNumber;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int principle = (int) readNumber("Principle", 1_000, 1_000_000);
        float annualInterest =
                (float) readNumber("Annual Interest Rate", 1, 30);
        byte years = (byte) readNumber("Period (Years)", 1, 30);

        MortgageCalculator calculator =
                new MortgageCalculator(principle, annualInterest, years);
        MortgageReport report = new MortgageReport(calculator);

        report.printMortgage();
        report.printPaymentSchedule();
    }
}