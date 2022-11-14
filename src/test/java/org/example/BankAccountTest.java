package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    void deposit() {
        BankAccount bankAccount = new BankAccount("Trevor", "Edwards", 1000.00);
        double dollars = bankAccount.deposit(100.00, true);
        assertEquals(1100.00, dollars, 0);
    }

    @Test
    void withdraw() {
        BankAccount bankAccount = new BankAccount("Trevor", "Edwards", 1000.00);
        bankAccount.withdraw(100.00, true);
        assertEquals(900.00, bankAccount.getDollars(),0);
    }

    @Test
    void getDollars() {
        BankAccount bankAccount = new BankAccount("Trevor", "Edwards", 1000.00);
        assertEquals(1000.00, bankAccount.getDollars(), 0);
    }
}

