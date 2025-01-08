public class Reverse {
    public static void main(String[] args) {
            int n = 10;

            System.out.println(printingReverse(n));
    }
    public static int printingReverse(int n) {
        if(n<=1)
            return 1;
        else {
            System.out.println(n);
            return printingReverse(n-1);
        }
    }
}
