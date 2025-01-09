package binarySearch;

public class Find_Element_In_Infinite_Array {
    public static void main(String[] args) {

        int[] arr = {2,4,5,6,7,8,9,12,15,17,19,22,25,29,33,36,38,41,44,47,50};
        int target = 25;
        System.out.println(findPositions(arr,target));
    }

    static int findPositions (int[] arr, int target){
        int start = 0; int end = 1;

        while (target > arr[end]){
            int temp = end + 1;
            end = end + (end-start+1) * 2;
            start = temp;

            System.out.println(start+" AND "+end);
        }

        return binarySearch(arr,target,start,end);
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        while (start <= end){
            int mid = start + (end - start) / 2;

            if (arr[mid] < target) start = mid + 1;
            else if (arr[mid] > target) end = mid - 1;
            else return mid;
        }
        return -1;
    }
}
