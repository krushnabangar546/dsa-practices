package linearSearch;

public class FindMinimumNumber {

    public static void main(String[] args) {
        int[] arr = {14, 12, 7, 3, 2, 33};
        System.out.println(findMinNumber(arr));
    }

    static int findMinNumber (int[] arr){
        int min = arr[0];

        for (int i = 1; i< arr.length; i++){
            if (min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}
