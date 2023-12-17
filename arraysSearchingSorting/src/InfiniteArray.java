public class InfiniteArray {

    static int ans(int[]arr,int target){
        //first find the range
        //first start with a box of size 2
        int start=0;
        int end=1;

        //condition for the target to lie in the range
        while(target>arr[end]){
            int newStart=end+1;
            // double the box value
            //end=previous end+boxOfSize*2;
            end=end+(end-start+1)*2;
            start=newStart;
        }
        return binarySearch(arr,target,start,end);
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
       int[] arr={3,5,6,7,9,10,90,100,130,140,160,170};
       int target=10;
        System.out.println(ans(arr,target));
    }
}
