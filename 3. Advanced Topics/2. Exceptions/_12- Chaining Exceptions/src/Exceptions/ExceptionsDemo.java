package Exceptions;

import java.io.IOException;

public class ExceptionsDemo {
    public static void show() {
        Account account;
        account = new Account();
        try {
            account.withdraw(10);
        } catch (AccountException e) {
            //            throw new RuntimeException(e);
            Throwable cause = e.getCause();
            System.out.println(cause.getMessage());
        }
    }
}
