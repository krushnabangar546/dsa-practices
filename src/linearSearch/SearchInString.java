package linearSearch;

public class SearchInString {

    public static void main(String[] args) {
        String name = "Krushna";
        char target = 'K';
        System.out.println(searchElement3(name, target));
    }

    // by using toCharArray() method
    public static boolean searchElement (String name, char target){

        char[] str = name.toCharArray();
        for (int i = 0; i < str.length; i++){
            if (target == str[i]){
                return true;
            }
        }
        return false;
    }

    // by iterate for each loop over char Array
    public static boolean searchElement2 (String name, char target){

        for (char c : name.toCharArray()) {
            if (target == c) {
                return true;
            }
        }
        return false;
    }

    // by using charAt() method
    public static boolean searchElement3 (String name, char target){
        for (int i = 0; i < name.length(); i++){
            if (target == name.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
