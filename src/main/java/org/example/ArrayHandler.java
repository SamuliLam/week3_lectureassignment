package org.example;

import java.util.Arrays;

public class ArrayHandler {
    public static boolean singleDimensionalArrayEquality(int[] a1, int[] a2) {
        return Arrays.equals(a1, a2);
    }

    public static boolean multiDimensionalArrayEquality(int[][] a1, int[][] a2) {
        return Arrays.deepEquals(a1, a2);
    }

    public static boolean differentTypesOfArrayEquality(String[] a1, double[] a2) {
        double[] a1AsDoubles = Arrays.stream(a1).mapToDouble(Double::parseDouble).toArray();
        return Arrays.equals(a1AsDoubles, a2);
    }
}