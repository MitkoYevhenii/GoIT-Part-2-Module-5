package ua.goit;

import java.math.BigInteger;

public class FibonacciTest {
    public static void main(String[] args) {
        int n = 35; // Приклад для n = 25

        long startTime = System.currentTimeMillis();
        BigInteger iterativeResult = Fibonacci.fibonacciIterative(n);
        long endTime = System.currentTimeMillis();
        System.out.println("Ітераційний метод: " + iterativeResult);
        System.out.println("Час виконання (Ітераційний метод): " + (endTime - startTime) + " мс");

        startTime = System.currentTimeMillis();
        BigInteger recursiveResult = Fibonacci.fibonacciRecursive(n);
        endTime = System.currentTimeMillis();
        System.out.println("Рекурсивний метод: " + recursiveResult);
        System.out.println("Час виконання (Рекурсивний метод): " + (endTime - startTime) + " мс");

        startTime = System.currentTimeMillis();
        BigInteger dpResult = Fibonacci.fibonacciDP(n);
        endTime = System.currentTimeMillis();
        System.out.println("Динамічне програмування: " + dpResult);
        System.out.println("Час виконання (Динамічне програмування): " + (endTime - startTime) + " мс");
    }
}
