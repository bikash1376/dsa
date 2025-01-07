import java.util.*;

public class hashing1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1, 2, 2, 3, 1, 4};
        //System.out.println(frequencyCounting(arr, in));

        String str = "bikashsahu";
        charHashing(str);
    }

    public static int frequencyCounting(int[] arr, Scanner in) {
        int[] hashArray = new int[10];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0 && arr[i] < hashArray.length) {
                hashArray[arr[i]] += 1;
            }
        }
        System.out.println("Enter number of queries you want to search:");
        int q = in.nextInt();
        while (q-- > 0) {
            int num = in.nextInt();
            if (num >= 0 && num < hashArray.length) {
                System.out.println("Frequency of " + num + " is: " + hashArray[num]);
            } else {
                System.out.println(num + " is out of range.");
            }
        }
        return 0;
    }

    public static void charHashing(String str) {
        int[] charCount = new int[128];

        for(char c:str.toCharArray()) {
            charCount[c]++;
        }
        for(char c=0;c<charCount.length;c++) {
            if(charCount[c]>0) {
                System.out.println(c+ ":" +charCount[c]);
            }
        }
    }

    public static void charHashingHashMap(String str) {
        HashMap<Character, Integer> charCount = new HashMap
    }
}
