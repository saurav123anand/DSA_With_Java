public class Q11 {
    // search in rotated binary search

    static int search(int[]arr,int target,int start,int end){
        int mid=start+(end-start)/2;
        if(start>end){
            return -1;
        }
        if(arr[mid]==target){
            return mid;
        }
        if(arr[start]<=arr[mid]){
            if(target>=arr[start] && target<=arr[mid]){
                return search(arr,target,start,mid-1);
            }
            return search(arr,target,mid+1,end);
        }
        else if(target>=arr[mid] && target<=arr[end]){
            return search(arr,target,mid+1,end);
        }
        return  search(arr,target,start,mid-1);
    }

    public static void main(String[] args) {
        int[] arr={5,6,7,8,9,1,2,3};
        System.out.println(search(arr,8,0,arr.length-1));
    }
}
