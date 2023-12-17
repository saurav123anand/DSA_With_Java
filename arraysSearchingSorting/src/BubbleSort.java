import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
    public static  void sort(int[]arr){
        boolean swapped=false;
        for(int i=0;i<arr.length;i++){
            for (int j = 1; j <=arr.length-i-1; j++) {
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    public static void swap(int[]arr, int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
    public static void main(String[] args) {
        int[] arr={4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
