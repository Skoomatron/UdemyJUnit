package org.example;

public class BankAccount {
    private String firstName;
    private String lastName;
    private double dollars;

    public BankAccount(String firstName, String lastName, Double dollars) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dollars = dollars;
    }

    public double deposit(double amount, boolean branch) {
        dollars += amount;
        return dollars;
    }

    public double withdraw(double amount, boolean branch) {
        dollars -= amount;
        return dollars;
    }

    public double getDollars() {
        return dollars;
    }
}
