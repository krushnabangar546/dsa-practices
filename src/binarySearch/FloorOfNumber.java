package binarySearch;

public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr = {5, 6, 34, 45, 56, 67, 78, 88, 99};
        int target = 55;

        System.out.println(findFloorOfNumber(arr, target));
    }

    private static int findFloorOfNumber(int[] arr, int target) {
        int start = 0; int end = arr.length-1;

        while (start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) start = mid + 1;
            else if (arr[mid] > target) end = mid - 1;
            else return mid;
        }
        return end;
    }
}
