public class Recursion1 {
    public static void main(String[] args) {
        int n = 5;
         // int a = sum(n);
        //System.out.println(a);


        printing(n);

    }


    public static int sum(int n) {
        int s =0;
        if(n<=0) {
            return 0;
        }
        return n + sum(n-1 );
    }

    public static void printing(int n) {
        if(n<=0) {
            return;
        }

        printing(n-1);
        System.out.println(n);



    }

}
