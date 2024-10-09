package com.thealgorithms.maths;

public class GreatestCommonDivisor {
    // Function to return the GCD of two numbers using Euclid's Algorithm
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println("GCD of 48 and 18 is: " + gcd(48, 18));
    }
}
