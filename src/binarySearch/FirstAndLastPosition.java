package binarySearch;

import java.util.Arrays;

public class FirstAndLastPosition {

    public static void main(String[] args) {


        int[] arr = {2,4,6};
        int target = 6;
        System.out.println(Arrays.toString(firstAndLastPosition(arr, target)));
    }

    static int[] firstAndLastPosition (int[] arr, int target){

        int[] ans = {-1, -1};

        int start = searchElement(arr, target, true);
        int end = searchElement(arr, target, false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }
    static int searchElement(int[] arr, int target, boolean isFirst) {
        int start = 0; int end = arr.length-1;
        int res = -1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] < target)  start = mid + 1;
            else if (arr[mid] > target) end = mid - 1;
            else {
                res = mid;
                if (isFirst) end = mid -1;
                else start = mid + 1;
            }
        }
        return res;
    }
}
