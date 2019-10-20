package com.jetbrains;

public class Main {

    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        saver1.modifyInterestRate(.04);
        saver2.modifyInterestRate(.04);
        for (int i = 0; i < 12; i++) {
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();

            System.out.println("Balance after months- Saver 1: " + saver1.getSavingsBalance() + " Saver 2: " + saver2.getSavingsBalance() );
        }
        saver1.modifyInterestRate(.05);
        saver2.modifyInterestRate(.05);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println("Balance after month- Saver 1: " + saver1.getSavingsBalance() + " Saver 2: " + saver2.getSavingsBalance() );
    }
}
