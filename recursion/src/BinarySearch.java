public class BinarySearch {
    public static void main(String[] args) {
         int[] arr={1,2,3,4,55,66,78};
        System.out.println(search(arr,78,0,arr.length-1));
    }
    static int search(int[]arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(target<arr[mid]){
            return search(arr,target,start,mid-1);
        }
        return search(arr,target,mid+1,end);

    }
}
