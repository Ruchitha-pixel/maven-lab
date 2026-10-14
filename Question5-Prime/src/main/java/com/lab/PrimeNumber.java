package com.lab;

public class PrimeNumber {
    public boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= n / i; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 17;
        System.out.println(n + (new PrimeNumber().isPrime(n) ? " is Prime" : " is not Prime"));
    }
}