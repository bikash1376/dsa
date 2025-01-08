public class Gcd {
    public static void main(String[] args) {

        int n1=200; int n2=160;
        System.out.println(gcd(n1,n2));
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

