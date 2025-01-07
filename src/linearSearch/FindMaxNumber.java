package linearSearch;

public class FindMaxNumber {
    public static void main(String[] args) {
        int[] arr = {14, 172, 7, 3, 2, 33};
        System.out.println(findMaxNumber(arr));
    }

    static int findMaxNumber (int[] arr){
        int min = arr[0];

        for (int i = 1; i< arr.length; i++){
            if (min < arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}
