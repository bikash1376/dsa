public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,52,2,58,3};
        int target = 58;

/*        int result = linearSearch(arr, target);
        System.out.println(result);

        int res = linearSearch2(arr, target);
        System.out.println(res);*/

        System.out.println(linearSearch3(arr,target));
    }
    public static int linearSearch(int[] arr, int target) {
        if(arr.length == 0)
            return -1;
        for(int i =0;i<arr.length;i++) {
            int element = arr[i];
            if(element == target)
                return i;
        }
        return -1;
    }

    public static int linearSearch2(int[] arr, int target) {
        if(arr.length == 0)
            return -1;
        for(int element : arr) {
            int num = element;
            if(element== target)
                return element;
        }
        return -1;
    }

    public static boolean linearSearch3(int[] arr, int target) {
        if(arr.length == 0)
            return false;
        for (int j : arr) {
            if (j == target)
                return true;
        }
        return false;
    }

}
