package org.shvetsov;

import org.shvetsov.core.LeetCode;
import org.shvetsov.core.Level;

import java.util.ArrayList;
import java.util.List;

@LeetCode(
        number = 592,
        name = "Fraction Addition and Subtraction",
        level = Level.MEDIUM,
        tags = {"Math", "String", "Simulation"}
)
public class _592 {
    public String fractionAddition(String expression) {
        if (expression.isEmpty()) return "0/1";
        List<Fraction> fractions = new ArrayList<>();
        int i = 0;
        int j = expression.indexOf('/', i);
        while (i < expression.length()) {
            int numerator = Integer.parseInt(expression.substring(i, j));
            i = j + 1;
            int minus = expression.indexOf('-', i);
            int plus = expression.indexOf('+', i);
            j = Math.min(minus == -1 ? expression.length() : minus, plus == -1 ? expression.length() : plus);
            int denominator = Integer.parseInt(expression.substring(i, j));
            i = j;
            j = expression.indexOf('/', i);
            fractions.add(new Fraction(numerator, denominator));
        }
        //find common denominator
        int commonDenominator = fractions.stream()
                .mapToInt(value -> value.denominator)
                .distinct()
                .reduce(1, (a, b) -> a * b);

        Fraction notIrreducible  = fractions.stream()
                .reduce(new Fraction(0, 1), (fraction, fraction2) -> fraction.add(fraction2, commonDenominator));
        return notIrreducible.reduce().toString();
    }

    public record Fraction(int numerator, int denominator) {

        public Fraction add(Fraction other, int commonDenominator) {
            return new Fraction(numerator * (commonDenominator/denominator) + other.numerator * (commonDenominator/other.denominator), commonDenominator);
        }

        public Fraction reduce() {
            if (numerator == 0) return new Fraction(0, 1);
            int newNumerator = numerator;
            int newDenominator = denominator;
            int max = Math.max(newNumerator, newDenominator);
            for (int i = 2; i <= max; i++) {
                while (newNumerator % i == 0 && newDenominator % i == 0) {
                    newNumerator /= i;
                    newDenominator /= i;
                }
                max = Math.max(newNumerator, newDenominator);
            }
            return new Fraction(newNumerator, newDenominator);
        }

        @Override
        public String toString() {
            return numerator + "/" + denominator;
        }
    }
}