package HashingSearchTechnic;

public class FindDuplicates {

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 4};
        duplicates(arr);
    }

    static void duplicates(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[Math.abs(arr[i])] < 0){
                System.out.println("Duplicate found: "+ Math.abs(arr[i]));
                return;
            }else {
                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
            }
        }
        System.out.println("No Duplicate found...");
    }
}
