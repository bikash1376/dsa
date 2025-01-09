public class FindMinInArray {
    public static void main(String[] args) {
        int[] arr = {1,52,2,58,3};
        int min = min(arr);
        System.out.println(min);
    }
    public static int min(int[] arr) {
        int min = arr[0];
        for(int i =1;i<arr.length;i++) {
            if(arr[i] < min)
                min = arr[i];
        }
        return min;
    }
}
