public class OrderAgnosticBinarySearch {
    static int orderAgnostic(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
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
        int[]arr={5,8,9,90};
        int[]arr2={56,45,34,23,13,2};
        System.out.println(orderAgnostic(arr,9));
        System.out.println(orderAgnostic(arr2,23));
    }
}
