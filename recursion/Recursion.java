public class Recursion {
    public static void main(String[] args) {
        int n = 10;

        //System.out.println(printingReverse(n));
        //printing(1,n);

        //int sum = sum(n);
        //System.out.println(sum);

       //int fact = fact(n);
        //System.out.println(fact);

        //int x=3;
        //System.out.println(exponent(x,n));

        //System.out.println(fibonacci(n));

        //int n1=200; int n2=160;
        //System.out.println(gcd(n1,n2));


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


    public static int printingReverse(int n) {
        if(n<=1)
            return 1;
        else {
            System.out.println(n);
            return printingReverse(n-1);
        }
    }

    public static int sum(int n) {
        if(n<1)
            return 0;
        else
            return n + sum(n-1);
    }

    public static int fact(int n) {
        if(n==0 || n==1)
            return 1;
        else
            return n* fact(n-1);
    }


    public static int exponent(int x, int n) {
        if(n==0)
            return 1;
        else
            return x* exponent(x,n-1);
    }

    public static int fibonacci(int n) {
        if(n<=1)
            return n;
        else
            return fibonacci(n-1) + fibonacci(n-2);
    }

    public static int gcd(int n1, int n2) {
        if(n2!=0) {
            return gcd(n2, n1%n2);
        }
        else {
            return n1;
        }
    }
}