
package com.lab;

public class App {

    public static int[] fibonacci(int count) {
        if (count < 0) {
            throw new IllegalArgumentException("Count cannot be negative");
        }

        int[] series = new int[count];

        if (count > 0) {
            series[0] = 0;
        }
        if (count > 1) {
            series[1] = 1;
        }

        for (int i = 2; i < count; i++) {
            series[i] = series[i - 1] + series[i - 2];
        }

        return series;
    }

    public static void main(String[] args) {
        int count = 10;
        System.out.print("Fibonacci Series: ");

        int[] series = fibonacci(count);
        for (int number : series) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}