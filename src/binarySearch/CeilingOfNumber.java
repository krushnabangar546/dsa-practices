package binarySearch;

public class CeilingOfNumber {

    public static void main(String[] args) {
        int[] arr = {5, 6, 34, 45, 56, 67, 78, 88, 99};
        int target = 57;

        char[] ch = {'a', 'c', 'e', 'j', 'm'};
        char tg = 'z';
        System.out.println(findCeilingOfNumber(arr, target));
        //System.out.println(findCeilingCharacter(ch, tg));
    }

    private static int findCeilingOfNumber(int[] arr, int target) {
        int start = 0; int end = arr.length-1;

        while (start <= end){
            int mid  = start + (end - start) / 2;
            if(arr[mid] < target) start = mid + 1;
            else if (arr[mid] > target) end = mid - 1;
            else return mid;
        }
        return start;
    }


    // find the smallest character larger than target
    private static char findCeilingCharacter(char[] arr, char target) {
        int start = 0; int end = arr.length-1;

        while (start <= end){
            int mid  = start + (end - start) / 2;
            if(arr[mid] < target) start = mid + 1;
            else  end = mid - 1;
        }
        return arr[start % arr.length];
    }
}
