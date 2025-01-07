package linearSearch;

import java.util.Arrays;

public class FindMaxIn2DArray {

    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3},
                {78, 5, 13, 7},
                {99, 66, 33, 2}
        };

        System.out.println(maxIn2D(arr));
    }

    static int maxIn2D (int[][] arr){
        int max = arr[0][0];
        for(int r = 0; r < arr.length; r++){
            for (int c = 0; c < arr[r].length; c++) {
                if (max < arr[r][c]){
                    max = arr[r][c];
                }
            }
        }
        return max;
    }
}
