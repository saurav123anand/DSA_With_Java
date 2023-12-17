import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test {
    public static double average(int[] salary) {
        boolean swapped=false;
        for(int i=0;i<salary.length;i++){
            for(int j=1;j<=salary.length-i-1;j++){
                if(salary[j]<salary[j-1]){
                    swap(salary,j,j-1);
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
        double sum=0;
        for(int i=1;i<salary.length-1;i++){
            sum+=salary[i];
        }
        System.out.println(salary.length-2);
        return sum/((salary.length)-2);
    }
    public static void swap(int[]arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    public static void main(String[] args) {
        int[]arr={4000,3000,1000,2000};
        System.out.println(average(arr));

    }
}
