public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setBaseSalary(100);
        employee.setHourlyRate(20);

        int wage = employee.calculateWage(10);
        System.out.println(wage);
        System.out.println(employee.getBaseSalary());
        System.out.println(employee.getHourlyRate());
    }
}