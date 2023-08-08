package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    class BankAccount {
        private int id;
        private String name;
        private double balance;

        public BankAccount(int id, String name, double balance) {
            this.id = id;
            this.name = name;
            this.balance = balance;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double amount) {
            if (amount > 0 && amount % 100 == 0) {
                balance += amount;
                System.out.println("Deposit successful. New balance: " + balance);
            } else {
                System.out.println("Invalid deposit amount.");
            }
        }

        public void withdraw(double amount) {
            if (amount > 0 && amount % 100 == 0) {
                if (balance >= amount) {
                    balance -= amount;
                    System.out.println("Withdrawal successful. New balance: " + balance);
                } else {
                    System.out.println("Insufficient balance.");
                }
            } else {
                System.out.println("Invalid withdrawal amount.");
            }
        }

        @Override
        public String toString() {
            return "BankAccount{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", balance=" + balance +
                    '}';
        }
    }
}
