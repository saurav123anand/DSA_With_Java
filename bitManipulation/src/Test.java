import java.util.Arrays;
import java.util.List;

public class Test {
    public static int[] findErrorNums(int[] nums) {
        List numsList = Arrays.asList(nums);
        int[] result=new int[2];
        boolean isContains=numsList.contains(1); //false
        System.out.println("isContains = "+isContains);
        // if(!numsList.contains(1)){
        //     result[1]=1;
        //     contain=false;
        // }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                if(!isContains){
                    result[0]=nums[i];
                    result[1]=1;
                    return result;
                }
                return new int[]{nums[i],nums[i]+1};
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] arr={1,2,2,4};
        //System.out.println(Arrays.toString(findErrorNums(arr)));
        int n=5;
        int start=0;
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=start + 2 * i;
        }
        System.out.println(Arrays.toString(nums));
    }
}
