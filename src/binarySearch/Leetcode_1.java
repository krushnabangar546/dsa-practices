package binarySearch;

// LeetCode Problem No : 4 || Binary Search
// Given two sorted arrays nums1 and nums2 of size m and n respectively,
// return the median of the two sorted arrays.
public class Leetcode_1 {

    public static void main(String[] args) {

        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};

        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

       int a =  nums1.length;
       int b = nums2.length;

       int c = a + b;

       int[] nums3 = new int[c];

        System.arraycopy(nums1, 0, nums3, 0, a);

        System.arraycopy(nums2, 0, nums3, a + 0, b);

        int start = 0; int end = nums3.length-1;
        for (int i = 0; i < nums3.length; i++) {
            double med = start + end / 2;
            return med;
        }
        return -1;
    }
}
