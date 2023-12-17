import java.util.Arrays;

public class QuickSort {
    static void  quickSort(int[] arr,int low,int high){
        if(low>=high){
            return;
        }
        int s=low;
        int e=high;
        int mid=s+(e-s)/2;
        int pivot=arr[mid];
        while(s<=e){
            //also a reason why if its already sorted it'll not swap
            while (arr[s]<pivot){
                s++;
            }
            while (arr[e]>pivot){
                e--;
            }
            if(s<=e){
               int temp=arr[s];
               arr[s]=arr[e];
               arr[e]=temp;
               s++;
               e--;
            }
        }
        //now my pivot is at correct index, please sort two halves
        quickSort(arr,low,e);
        quickSort(arr,s,high);
    }
    public static void main(String[] args) {
       int[] arr={5,4,3,2,1};
       quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
