package binarySearch;

public class FindElement {

    public static void main(String[] args) {
        int[] arr = {4, 6, 8, 23, 46, 56, 67};
        int target = 23;

        System.out.println(findElementUsingBinarySearch(arr, target));
        System.out.println(findElementUsingRecursion(arr, target, 0, arr.length-1));
    }

    private static int findElementUsingBinarySearch(int[] arr, int target) {
        int start = 0; int end = arr.length-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] < target)  start = mid + 1;
            else if (arr[mid] > target) end = mid - 1;
            else return mid;
        }
        return -1;
    }

    // find element in an array using binary search algorithm and recursion
    private static int findElementUsingRecursion(int[] arr, int target, int start, int end) {
        int mid = start + (end - start) / 2;
        if(start > end) return -1;
        if(arr[mid] < target)  return findElementUsingRecursion(arr, target, mid + 1, end);
        else if (arr[mid] > target)  return findElementUsingRecursion(arr, target, start, mid - 1);
        else return mid;
    }
}
