public class BinarySearch {
    static int binarySearch(int[] arr, int target){
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int target=22;
//        int[] arr={3,7,9,12,15};
//        int target=12;
        System.out.println(binarySearch(arr,target));
    }
}
