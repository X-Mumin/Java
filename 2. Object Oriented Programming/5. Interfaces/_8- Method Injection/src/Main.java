public class Main {

    public static void main(String[] args) {

        TaxReport taxReport = new TaxReport();

        taxReport.show(new TaxCalculator2018(100_000));

        taxReport.show(new TaxCalculator2019());
    }
}
