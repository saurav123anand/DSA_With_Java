import java.util.ArrayList;
import java.util.List;

public class Factorial {
    static ArrayList<Integer> factorial(int N){
        //code here
        ArrayList<Integer> result=new ArrayList<>();
        result.add(1);
        for(int i=2;i<=N;i++){
            int carry=0;
            int j;
            for(j=0;j<result.size();j++){
                int val=result.get(j)*i+carry;
                result.add(j,val%10);
                carry=val/10;
            }
            while(carry!=0){
                result.add(j,carry%10);
                carry=carry/10;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
