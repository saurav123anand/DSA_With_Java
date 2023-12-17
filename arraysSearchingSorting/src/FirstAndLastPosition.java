import java.util.Arrays;

public class FirstAndLastPosition {
    static int position(int[]arr,int target){
        int[] result={-1,-1};
        int firstIndex=search(arr,target,true);
//        int lastIndex=search(arr,target,false);
//        result[0]=firstIndex;
//        result[1]=lastIndex;
//        return result;
        return firstIndex;
    }

    static int search(int[] arr,int target,boolean findFirstIndex){
        int ans=-1;
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                //potential answer found
                ans=mid;
                if(findFirstIndex){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
         //int[] arr={5,7,7,7,7,8,8,10};
         int[]arr={3,4,5,8,9,11,12};
//        System.out.println(Arrays.toString(position(arr,7)));
        System.out.println(position(arr,9));
    }
}
