import java.util.*;

import static java.lang.Math.max;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0,1, 1, 1};
        System.out.println(maxConsecutiveOnes(arr));

    }
    public static int maxConsecutiveOnes(int[] arr) {
        int count = 0;
        int maxm = 0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==1) {
                count++;
                maxm = max(maxm,count);
            }
            else {
                count = 0;
            }
        }
        return maxm;

    }
}
