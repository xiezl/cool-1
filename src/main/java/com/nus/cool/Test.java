package com.nus.cool;

import java.util.Arrays;
import java.util.Random;

public class Test {
    public static void main(String[] args) {

        int[] test = generateArray(100000000);
        test1(test);
        test2(test);
    }

    private static int test1(int i) {
        return (((((i) >>> 6) + 1) << 6));
    }

    private static int test2(int i) {
        return (((i - 1) >>> 6) + 1) << 6;
    }

    private static int[] generateArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt();
        }
        return array;
    }

    private static void test1(int[] test) {
        long begin = System.currentTimeMillis();
        int max = Arrays.stream(test).max().getAsInt();
        System.out.println(max);
        long end = System.currentTimeMillis();
        System.out.println(end - begin);
    }

    private static void test2(int[] test) {
        long begin = System.currentTimeMillis();
        int max = Integer.MIN_VALUE;
        for (int t : test) {
            max = Math.max(t, max);
        }
        System.out.println(max);
        long end = System.currentTimeMillis();
        System.out.println(end - begin);
    }
}
