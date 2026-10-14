
package com.lab;

public class EvenOdd {

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        EvenOdd obj = new EvenOdd();

        int number = 7;

        if (obj.isEven(number)) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
    }
}
