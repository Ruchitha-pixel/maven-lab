package com.lab;

public class ReverseNumber {
    public int reverse(int number) {
        int sign = number < 0 ? -1 : 1;
        long n = Math.abs((long) number);
        long result = 0;
        while (n > 0) {
            result = result * 10 + n % 10;
            n /= 10;
        }
        result *= sign;
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
            throw new ArithmeticException("Reversed number overflows int");
        return (int) result;
    }

    public static void main(String[] args) {
        System.out.println(new ReverseNumber().reverse(1234));
    }
}