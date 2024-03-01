import java.util.Arrays;

public class MergeSort {
//    static int[] mergeSort(int[] arr){
//       if(arr.length==1){
//           return arr;
//       }
//       int mid=arr.length/2;
//       int[] left=mergeSort(Arrays.copyOfRange(arr,0,mid));
//       int[] right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
//       return merge(left,right);
//    }
//
//    private static int[] merge(int[] left, int[] right) {
//        int[] mixed=new int[left.length+right.length];
//        int i=0;
//        int j=0;
//        int k=0;
//        while(i<left.length && j<right.length){
//            if(left[i]<right[j]){
//                mixed[k++]=left[i++];
//            }
//            else {
//                mixed[k++]=right[j++];
//            }
//        }
//        while (i<left.length){
//            mixed[k++]=left[i++];
//        }
//        while (j<right.length){
//            mixed[k++]=right[j++];
//        }
//        return mixed;
//
//    }

    // IN PLACE
    static void mergeSortInPlace(int[] arr,int s,int e){
        if(e-s==1){
            return;
        }
        int mid=(s+e)/2;
        mergeSortInPlace(arr,s,mid);
        mergeSortInPlace(arr,mid,e);
        mergeInPlace(arr,s,mid,e);
    }

    private static void mergeInPlace(int[] arr,int s,int m,int e) {
        int[] mixed=new int[e-s];
        int i=s;
        int j=m;
        int k=0;
        while(i<m && j<e){
            if(arr[i]<arr[j]){
                mixed[k++]=arr[i++];
            }
            else {
                mixed[k++]=arr[j++];
            }
        }
        while (i<m){
            mixed[k++]=arr[i++];
        }
        while (j<e){
            mixed[k++]=arr[j++];
        }
        for (int l = 0; l < mixed.length; l++) {
            arr[s+l]=mixed[l];
        }

    }

    public static void main(String[] args) {
         int[] arr={9,3,6,2,0};
        //System.out.println(Arrays.toString(mergeSort(arr)));
        mergeSortInPlace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
