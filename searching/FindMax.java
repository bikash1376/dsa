public class FindMax {
    public static void main(String[] args) {
        int[] arr = {1,52,2,58,3};
        int max = max(arr);
        System.out.println(max);
    }
    public static int max(int[] arr) {
        int max = arr[0];
        for(int i =1;i<arr.length;i++) {
            if(arr[i] > max)
                max = arr[i];
        }
        return max;
    }
}
