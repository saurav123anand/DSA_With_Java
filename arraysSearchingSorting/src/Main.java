import javax.management.ValueExp;
import java.lang.invoke.SerializedLambda;
import java.time.LocalDate;
import java.util.*;

public class Main {
    public static int thirdMax(int[] nums) {
        //Arrays.sort(nums);
        if(nums.length<=2){
            return nums[nums.length-1];
        }
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int max3=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int val=nums[i];
            if(val==max1 || val==max2 || val==max3){
                continue;
            }
            if(val>max1){
                max3=max2;
                max2=max1;
                max1=val;
            }
            else if(val>max2){
                max3=max2;
                max2=val;
            }
            else if(val>max3){
                max3=val;
            }
        }
        return max3;
    }
    public static void main(String[] args) {
        int[] arr={2,2,3,1};
        System.out.println(thirdMax(arr));
    }
}