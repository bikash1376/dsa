public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6};
        System.out.println(missingNum(arr));

    }
    public static int missingNum(int[] arr) {
        for(int i=1;i<=arr.length;i++) {
            int flag =0;
            for(int j=0;j<arr.length-1;j++) {
                if(arr[j]==i) {
                    flag=1;
                    break;
                }
            }
            if(flag == 0)
                return i;

        }
        return -1;
    }

    public static int missingNum2(int[] arr) {
        int n = arr.length +1;
        int sum = (n*(n+1))/2;
        int s =0;
        for (int j : arr) {
            s = s + j;
        }
        return sum - s;

    }
}
