import java.util.Arrays;

public class SecondLargest {

    public static void main(String[] args) {
        int[] arr = {3,2,4,5,6};

        //System.out.println(secondLargest1(arr));
        System.out.println("better: "+secondLargest2(arr));
    }

    // brutes force method.. using sorting
    // Time complexity : nlogn + n  = O(nlogn) AND Auxillary space : O(1)
    private static int secondLargest1(int[] arr) {

        int n = arr.length;

        Arrays.sort(arr);
        for(int i = n-2; i >=0; i--){
            if(arr[i] != arr[n-1]){
                return arr[i];
            }
        }
        return -1;
    }

    // better approach
    private static int secondLargest2(int[] arr){
        int n = arr.length;
        int largest = -1;
        int smallest = -1;

        for (int i = 0; i < n; i++){
            if (arr[i] > largest){
                largest = arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > smallest && arr[i] != largest){
                smallest = arr[i];
            }
        }
        return smallest;
    }
}
