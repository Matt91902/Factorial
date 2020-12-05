package com.company;

public class Factorial {

    public static void main(String[] args) {
        int n = 20;
        for (int x = 1; x <= n; x++) {
            System.out.println(calcFactorial(x));
        }
        System.out.println(calcE());
    }

    public static int calcFactorial(int n) {
        int total = 1;
        for (int i = n; i >= 1; i--) {
            total = total * i;
        }
        return total;
    }

    public static double calcE() {
        double e = 1;
        double olde = 1;
        for(int i = 1; i <= 10; i++) {
            while (e - olde > 0.001) {
                e = olde + (1.0 / calcFactorial(i));
                olde = e;
            }
        }
        return e;
    }
}