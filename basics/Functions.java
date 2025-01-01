import java.util.*;
public class Functions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = in.nextInt();
        int result = factorial(num);
        System.out.println("Factorial of " + num + " is: " + result);
    }
    public static int factorial(int n) {
        int f=1;
        if(n==0 || n==1)
            return 1;
        for(int i=1;i<=n;i++) {
            f = f*i;
        }
        return f;
    }
}
