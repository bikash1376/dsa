public class LinearSearchInString {
    public static void main(String[] args) {
        String str = "bikash";
        char ch = 's';
        System.out.println(search(str, ch));
    }
    public static boolean search(String str, char target) {
        if(str.isEmpty()) {
            return false;
        }
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == target)
                return true;
        }
        return false;
    }
}
