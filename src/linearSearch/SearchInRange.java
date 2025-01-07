package linearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        int target = 134;
        System.out.println(searchElementInRange(arr, target));
    }

    public static String searchElementInRange (int[] arr, int target){

        for (int i = 1; i <= 4; i++){
            if (target == arr[i]){
                return "Exists";
            }
        }
        return "Not-Exist";
    }
}
