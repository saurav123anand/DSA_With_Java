public class CeilingOfNumber {
    static int ceil(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            // if target number is greater than the greater number in the array
            if(target>arr[arr.length-1]){
                return -1;
            }
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int[]arr={2,3,5,9,14,16,18};
        int target=15;
        System.out.println(ceil(arr,target));

    }
}
