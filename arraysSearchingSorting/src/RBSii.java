public class RBSii {
    static int findPivot(int[]arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            // 4 cases over here
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            // if elements at middle,start and end are equal then just skip the duplicates
            if(arr[mid]==arr[start] && arr[mid]==arr[end]){
                // skip the duplicates \

                // NOTE : What if these elements at start and end were the pivots  ??
                // check if start is pivot
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                // check whether end is pivot or not
                if(arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }
            // left side is sorted , so pivot should be in right
            else if (arr[start]<arr[mid] && (arr[start]==arr[mid] && arr[end]<arr[mid])){
                  start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    static int search(int[]arr,int target){
        int pivot=findPivot(arr);
        // if you didn't find the pivot it means the array is not rotated
        if(pivot==-1){
            // just do normal binary search
            return  binarySearch(arr,target,0,arr.length-1);
        }
        // if pivot is found, you have found 2 ascending sorted arrays
        if(arr[pivot]==target){
            return pivot;
        }
        if(target>arr[0]){
            return binarySearch(arr,target,0,pivot-1);
        }
        return binarySearch(arr,target,pivot+1,arr.length-1);
    }
    static int binarySearch(int[] arr, int target,int start,int end){
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

    }
}
