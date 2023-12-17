import java.util.Arrays;

public class ReverseArray {
    static void reverse(int[] arr){
        for(int i=0;i<arr.length/2;i++){
            swap(arr,i,arr.length-i-1);
        }
    }
    static void swap(int[] arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}
