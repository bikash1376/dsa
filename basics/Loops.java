import java.util.*;
public class Loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);



        //Fibonacci series
      /*  int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        for(int i=0; i<5;i++) {

            int c = a + b;
            System.out.println(c);
            a=b;
            b=c;


        }
          */



//GCD of two positive integers
    /*    int num1 = 252;
        int num2 = 105;
        int m = Math.max(num1, num2);
        int n = Math.min(num1, num2);

        while (n != 0) {
            int temp = m % n;
            m = n;
            n = temp;
        }

        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + m);
        */



//Number guessing
        Random rand = new Random();
        int r = rand.nextInt(101); // Generates a random integer between 0 (inclusive) and 101 (exclusive)


        boolean win = false;

         do {
            System.out.println("Guess the number..");
            int u = in.nextInt();
            if(u<r)
                System.out.println("Guess higher");
            if(u>r)
                System.out.println("Guess lower");
            if(u==r) {
                System.out.println("You guessed right!");
                win = true;
                break;
            }
        }
         while(!win);
        if(win)
            System.out.println("Congrats");

    }
}
