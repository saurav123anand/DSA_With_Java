public class FindInMountainArray {
    static int search(int[] arr,int target){
        int peakIndex=peakIndex(arr);
        int firstTry=orderAgnostic(arr,peakIndex,0,peakIndex);
        if(firstTry!=-1){
            return firstTry;
        }
        // try to search in second half
        return  orderAgnostic(arr,target,peakIndex+1,arr.length-1);
    }
    static int peakIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
    static int orderAgnostic(int[] arr,int target,int start,int end){
        boolean isAsc=arr[end]>arr[start];

        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target>arr[mid]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            else{
                if(target<arr[mid]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {

    }
}
