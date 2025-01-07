public class TwoSum {

    public static void main(String[] args) {
        int [] arr = {2,6,5,8,11};
        int target = 14;

        String result = twoSum(arr, target);

        System.out.println("result: "+result);
    }
    
    public static String twoSum (int [] arr, int target) {
        
        for (int i = 0; i<=arr.length; i++){
            for (int j = i+1; j<arr.length;j++){
                if(arr[i] + arr[j] == target){

                    return "matched indexed :"+arr[i] +"+"+arr[j];
                }
            }
        }
        return "No";
    }
}
