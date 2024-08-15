package ua.goit;

import java.math.BigInteger;

public class FibonacciTest {

    public static void main(String[] args) {
        long startTime;
        long endTime;
        BigInteger result;
        long durationTime;

        int n = 40; // Измените это значение для тестирования разных входных данных

        // Тест итеративного метода
        startTime = System.nanoTime();
        result = Fibonacci.fibonacciIterative(n);
        endTime = System.nanoTime();
        durationTime = endTime - startTime;
        System.out.println(STR."Iterative method result: \{result}");
        System.out.println(STR."Iterative method time: \{durationTime} ns\n");

        // Тест рекурсивного метода
        startTime = System.nanoTime();
        result = Fibonacci.fibonacciRecursive(n);
        endTime = System.nanoTime();
        durationTime = endTime - startTime;
        System.out.println(STR."Iterative method result: \{result}");
        System.out.println(STR."Iterative method time: \{durationTime} ns\n");

        // Тест метода динамического программирования
        startTime = System.nanoTime();
        result = Fibonacci.fibonacciDP(n);
        endTime = System.nanoTime();
        durationTime = endTime - startTime;
        System.out.println(STR."Iterative method result: \{result}");
        System.out.println(STR."Iterative method time: \{durationTime} ns\n");
    }
}

