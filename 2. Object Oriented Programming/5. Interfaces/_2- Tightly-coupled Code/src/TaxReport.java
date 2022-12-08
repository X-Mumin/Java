public class TaxReport {
    private TaxCalculator2018 taxCalculator;

    public TaxReport() {
        taxCalculator = new TaxCalculator2018(100_000);
    }

    public void show() {
        double tax = taxCalculator.calculateTax();
        System.out.println(tax);
    }
}
