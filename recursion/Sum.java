public class Sum {
    public static void main(String[] args) {
        int n = 5;

        int sum = sum(n);
        System.out.println(sum);
    }

    public static int sum(int n) {
        if(n<1)
            return 0;
        else
            return n + sum(n-1);
    }
}
