package com.company;

public class Factorial {

    public static void main(String[] args) {
        int n = 20;
        for (int x = 1; x <= n; x++) {
            System.out.println(calcFactorial(x));
        }
        calcE();
        calcEX(4.0);
    }

    public static int calcFactorial(int n) {
        int total = 1;
        for (int i = n; i >= 1; i--) {
            total = total * i;
        }
        return total;
    }

    public static void calcE() {
        double e = 1;
        double olde = 0;
        int i = 1;
        while(e - olde > 0.001){
            olde = e;
            e = olde + (1.0 / calcFactorial(i));
            i++;
        }
        System.out.printf("e is %2.3f \n", e);
    }

    public static void calcEX(double x){
        double eX = 1;
        double oldeX = 0;
        int i = 1;
        while(eX - oldeX > 0.001){
            oldeX = eX;
            eX = oldeX + (Math.pow(x,i) / calcFactorial(i));
            i++;
        }
        System.out.printf("e^x is %2.3f \n", eX);
    }
}