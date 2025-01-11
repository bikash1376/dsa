import java.util.*;
public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {6,8,1,3,7,4,9,2};
        int len = nums.length;
        int n = len +1;
        MissingNum1(nums, n);
        //System.out.println(MissingNum1(nums,n));
    }
    public static void MissingNum(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        boolean missing = false;
        for(int i=1;i<nums.length;i++) {
            if(nums[i]!=nums[i-1]+1) {
                missing = true;
                break;
            }
        }
        System.out.println(missing);
    }

    public static void MissingNum1(int[] nums,int n) {
        for(int i = 1; i<=n;i++) {
            boolean found = false;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) {
                    found = true;
                    break;
                }

            }
            if (!found) {
                // i;
                System.out.println("missing number is " + i);
            break;
        }
        }
    }
}
