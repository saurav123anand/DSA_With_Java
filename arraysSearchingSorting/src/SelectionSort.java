import java.util.Arrays;

public class SelectionSort {
    static void sort(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            // find the max element in the remaining array from i=0 to l-i-1 and swap it with the correct index ;
            int max=max(arr,0,arr.length-i-1);
            swap(arr,max,arr.length-i-1);
        }
    }
    public static int max(int[]arr, int start, int end){
        int maxIndex=0;
        for (int i=start;i<=end;i++){
            if(arr[i]>arr[maxIndex]){
                maxIndex=i;
            }
        }
        return maxIndex;
    }
    public static void swap(int[]arr, int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
    public static void main(String[] args) {
        int[]arr={};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
