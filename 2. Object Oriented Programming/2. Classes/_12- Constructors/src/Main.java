public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(100, 20);
        Employee employee1 = new Employee(150, 20);
        int wage = employee.calculateWage(10);
        int wage2 = employee1.calculateWage();
        System.out.println(wage);
        System.out.println(wage2);
    }
}