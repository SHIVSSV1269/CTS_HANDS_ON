package com.example.forecast;

import java.util.HashMap;
import java.util.Map;

/**
 * Exercise 7: Financial Forecasting.
 *
 * Predicts a future value based on a present value that grows by a fixed
 * annual growth rate, using recursion:
 *
 *   futureValue(years) = futureValue(years - 1) * (1 + rate)
 *   futureValue(0)     = presentValue
 *
 * Time complexity:
 *   - Naive recursion here is O(n) in the number of years (one call per year).
 *   - A tree-recursive formulation (like naive Fibonacci) would be O(2^n);
 *     that is optimized with memoization (shown below) to bring it to O(n).
 */
public class FinancialForecast {

    /** Simple linear recursion: O(n) time, O(n) call-stack depth. */
    public static double futureValue(double presentValue, double annualGrowthRate, int years) {
        if (years <= 0) {
            return presentValue;               // base case
        }
        return futureValue(presentValue, annualGrowthRate, years - 1) * (1 + annualGrowthRate);
    }

    /**
     * Memoized version. Demonstrates how to avoid recomputation when a
     * recursive definition would otherwise repeat sub-problems.
     */
    public static double futureValueMemo(double presentValue, double rate, int years,
                                         Map<Integer, Double> memo) {
        if (years <= 0) {
            return presentValue;
        }
        if (memo.containsKey(years)) {
            return memo.get(years);
        }
        double result = futureValueMemo(presentValue, rate, years - 1, memo) * (1 + rate);
        memo.put(years, result);
        return result;
    }

    public static void main(String[] args) {
        double presentValue = 1000.0;   // starting amount
        double growthRate    = 0.08;    // 8% per year
        int years            = 5;

        double predicted = futureValue(presentValue, growthRate, years);
        System.out.printf("Recursive forecast: %.2f grows at %.0f%% for %d years -> %.2f%n",
                presentValue, growthRate * 100, years, predicted);

        double predictedMemo = futureValueMemo(presentValue, growthRate, years, new HashMap<>());
        System.out.printf("Memoized forecast : %.2f%n", predictedMemo);

        System.out.println("\nYear-by-year projection:");
        for (int y = 0; y <= years; y++) {
            System.out.printf("  Year %d: %.2f%n", y, futureValue(presentValue, growthRate, y));
        }

        System.out.println("\nComplexity notes:");
        System.out.println("  - Linear recursion: O(n) time / O(n) stack.");
        System.out.println("  - Optimize deep/repeated recursion with memoization or an iterative loop");
        System.out.println("    to avoid excessive computation and stack overflow for large n.");
    }
}
