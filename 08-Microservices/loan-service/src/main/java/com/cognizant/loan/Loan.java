package com.cognizant.loan;

public class Loan {
    private String number;
    private String type;
    private double amount;
    private int tenureMonths;

    public Loan(String number, String type, double amount, int tenureMonths) {
        this.number = number; this.type = type; this.amount = amount; this.tenureMonths = tenureMonths;
    }
    public String getNumber()   { return number; }
    public String getType()     { return type; }
    public double getAmount()   { return amount; }
    public int getTenureMonths(){ return tenureMonths; }
}
