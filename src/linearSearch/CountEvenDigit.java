package linearSearch;


// Given an Array of nums of Integer, return how many o them contains an even number of digit.
// nums = [12, 345, 2, 6, 7896]
//output = 2
// only 12 and 7896 are even in count
public class CountEvenDigit {

    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};

        System.out.println(findEvenCount(nums));
    }

    private static int findEvenCount(int[] nums) {
        int count = 0;

        for (int num: nums) {
            if (even(num)){
                count++;
            }
        }
        return  count;
    }

    private static boolean even(int num) {
        int checkNumber = digitCount(num);
        return checkNumber % 2 == 0;
    }

    private static int digitCount(int num) {
        int count = 0;

        while (num > 0){
            count++;
            num /= 10;
        }

        return count;
    }
}
