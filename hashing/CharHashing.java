import java.util.Scanner;

public class CharHashing {
    public static void main(String[] args) {

        String str = "bikashsahu";
        charHashing(str);
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
}
