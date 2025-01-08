package ua.goit;

import java.math.BigInteger;


/**
 * Клас для обчислення чисел Фібоначчі трьома методами:
 * 1. Ітераційний метод
 * 2. Рекурсивний метод
 * 3. Метод динамічного програмування
 */
public class Fibonacci {

    /**
     * Ітераційний метод
     * Часова складність: O(n)
     * Просторова складність: O(1)
     */
    public static BigInteger fibonacciIterative(int n) {
        if (n <= 1) {
            return BigInteger.valueOf(n);
        }

        BigInteger prev = BigInteger.ZERO;
        BigInteger curr = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            BigInteger temp = curr;
            curr = curr.add(prev);
            prev = temp;
        }

        return curr;
    }

    /**
     * Рекурсивний метод
     * Часова складність: O(2^n)
     * Просторова складність: O(n) (виклики стека)
     */
    public static BigInteger fibonacciRecursive(int n) {
        if (n <= 1) {
            return BigInteger.valueOf(n);
        }
        return fibonacciRecursive(n - 1).add(fibonacciRecursive(n - 2));
    }

    /**
     * Метод динамічного програмування
     * Часова складність: O(n)
     * Просторова складність: O(n)
     */
    public static BigInteger fibonacciDP(int n) {
        if (n <= 1) {
            return BigInteger.valueOf(n);
        }

        BigInteger[] fib = new BigInteger[n + 1];
        fib[0] = BigInteger.ZERO;
        fib[1] = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1].add(fib[i - 2]);
        }

        return fib[n];
    }
}


