public class Exponent {
    public static void main(String[] args) {


        int n = 4;


        int x = 3;
        System.out.println(exponent(x, n));
    }

    public static int exponent(int x, int n) {
        if(n==0)
            return 1;
        else
            return x* exponent(x,n-1);
    }
    }
