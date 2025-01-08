import java.util.HashMap;

public class CharHashingHashmap {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 4};

        String str = "bikashsahu";
        charHashingHashMap(str);
    }
    public static void charHashingHashMap(String str) {
        HashMap<Character, Integer> charCount = new HashMap<>();
        for(char c:str.toCharArray()) {
            if(charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c)+1);
            }
            else {
                charCount.put(c,1);
            }
        }
        for(char c: charCount.keySet()) {
            System.out.println(c+ ":" + charCount.get(c));
        }
    }
}
