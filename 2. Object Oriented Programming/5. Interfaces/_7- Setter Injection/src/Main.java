public class Main {

    public static void main(String[] args) {
        TaxCalculator2018 taxCalculator2018 = new TaxCalculator2018(100_000);
        TaxReport taxReport = new TaxReport(taxCalculator2018);

        taxReport.show();

        taxReport.setTaxCalculator(new TaxCalculator2019());
        taxReport.show();
    }
}
