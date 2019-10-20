package com.jetbrains;

public class SavingsAccount {private static double annualInterestRate;
    private double savingsBalance;

    SavingsAccount(double save){

        this.savingsBalance = save;

    }

    public void calculateMonthlyInterest(){

        savingsBalance += (savingsBalance * annualInterestRate) / 12;
    }

    public void modifyInterestRate(double mod){

        annualInterestRate = mod;

    }

    /**  public void setStartSavingsBalance(float start){

     savingsBalance = start;
     * @return }**/

    public double getSavingsBalance(){

        return savingsBalance;

    }
}
