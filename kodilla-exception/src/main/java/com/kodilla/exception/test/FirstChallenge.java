package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        int a = 3;
        int b = 0;
        System.out.println("Próba podzielenia: " + a + " przez: " + b);
        try {
            double result = firstChallenge.divide(3, 0);
        } catch (ArithmeticException e){
            System.out.println("nie dzielimy przez zero");
        } finally {
            System.out.println("koniec programu");
        }
    }
}