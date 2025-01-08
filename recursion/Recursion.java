public class Recursion {
    public static void main(String[] args) {
        int n = 10;

        printing(1,n);



    }
    public static void printing(int i, int n) {
        if (i > n) {
            return;
        }
        else
        {
            System.out.println(i);
            printing(i + 1, n);
        }
    }







}