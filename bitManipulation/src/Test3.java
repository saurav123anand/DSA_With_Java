import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE && divisor==-1){
            return Integer.MAX_VALUE;
        }
        if(dividend==Integer.MIN_VALUE && divisor==1){
            return Integer.MIN_VALUE;
        }
        long dd=Math.abs(dividend);
        long dv=Math.abs(divisor);
        int ans=0;
        while(dv<=dd){
            long sum=dv;
            long count=1;
            while(sum<=dd-sum){
                sum+=sum;
                count+=count;
            }
            ans+=count;
            dd-=sum;
        }
        if((dividend<0 && divisor>0) || (dividend>0 && divisor<0)){
            return -ans;
        }
        return ans;

    }
    public static void main(String[] args) {
        System.out.println(divide(-2147483648,2));
    }
}
