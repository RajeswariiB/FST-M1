package activities;

import java.util.*;

public class Activity2 {
    public static void main(String[] args) {
        int[] a = {10, 77, 10, 54, -11, 10};
        System.out.println("Original Array: " + Arrays.toString(a));
        int b = 10;
        int c = 30;
        System.out.println("Result: " + result(a, b, c));
    }
    public static boolean result(int[] numbers, int d, int e) {
        int f = 0;
        for (int number : numbers) {
            if (number == d) {
              f += d;
            }
              if (f > e) {
               break;
            }
        }
        return f == e;
    }
	}