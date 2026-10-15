
package com.lab;

public class SimpleInterest {

    public double calculate(double principal, double rate, double time) {
        if (principal < 0 || rate < 0 || time < 0) {
            throw new IllegalArgumentException("Inputs must be non-negative");
        }

        return (principal * rate * time) / 100.0;
    }

    public static void main(String[] args) {
        SimpleInterest obj = new SimpleInterest();

        double interest = obj.calculate(1000, 5, 2);

        System.out.println("Simple Interest = " + interest);
    }
}
