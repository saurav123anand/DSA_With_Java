import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Test2 {
    public static void main(String[] args) {
        int[] arr={0,1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(sortByBits(arr)));

    }
    public static int[] sortByBits(int[] arr) {
        int n=arr.length;
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                int countFirst=countBits(arr[j]);
                int countSecond=countBits(arr[j+1]);
                if (countFirst > countSecond || countFirst==countSecond){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false)
                break;
        }
        return arr;
    }

    public static int countBits(int n){
        int count=0;
        while(n!=0){
            count++;
            n=n-(n&(-n));
        }
        return count;
    }
}
