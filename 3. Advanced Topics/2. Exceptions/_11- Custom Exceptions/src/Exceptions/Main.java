package Exceptions;

public class Main {
    public static void main(String[] args) {
        Account account;
        account = new Account();

        try {
            account.withdraw(10);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}