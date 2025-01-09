public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{8, 5, 1}, {3, 4, 2}, {7, 31, 9}};
        System.out.println(maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for(int[] ints : accounts) {
            int sum =0;
            for(int anInt:ints) {
                sum += anInt;
            }
            if(sum>ans){
                ans = sum;
            }
        }
        return ans;
    }
}
