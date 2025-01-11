public class WeirdAlgo {
    public static void main(String[] args) {
        int n = 3;
        if(n%2==0) {
            forEven(n);
        }
        else {
            forOdd(n);
        }
    }
    public static void forOdd(int n) {
        while(n%2!=0 && n!=1) {
            System.out.print(n+ " ");
            n= n* 3 + 1;
        }
        if(n==1) {
            System.out.println(n);
        }
        else {
            forEven(n);
        }
    }
    public static void forEven(int n) {
        while(n%2==0 && n!=1) {
            System.out.print(n+ " ");
            n=n/2;

        }
        if(n==1) {
            System.out.println(n);
        }
        else {
            forOdd(n);
        }
    }
}
