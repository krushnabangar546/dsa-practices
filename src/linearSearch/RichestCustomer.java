package linearSearch;

import java.util.Arrays;

public class RichestCustomer {

    public static void main(String[] args) {
        int [][] accounts = {
                {2, 4, 5},
                {9, 8, 8},
                {8, 7, 5}
        };

        System.out.println(richest3(accounts));

    }

    static String richest (int[][] arr) {
        int rich = 0;

        for (int[] ints : arr) {
            int max = 0;
            for (int anInt : ints) {
                max += anInt;
            }
            if (max > rich) {
                rich = max;
            }
        }
        return "Richest Person is: "+rich;
    }


    // using Math.max() method
    static String richest2 (int[][] arr) {
        int rich = 0;

        for (int[] ints : arr) {
            int max = 0;
            for (int anInt : ints) {
                max += anInt;
            }
            rich = Math.max(max, rich);
        }
        return "Richest Person is: "+rich;
    }

    // using stream
    static int richest3 (int[][] arr) {
        return Arrays.stream(arr)
                .mapToInt(customer -> Arrays.stream(customer).sum())
                .max()
                .orElse(0);
    }
}

