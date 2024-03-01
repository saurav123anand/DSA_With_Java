import java.util.Arrays;
import java.util.Comparator;
// https://youtube.com/shorts/lB8Sq1eRxcY?feature=share
public class Main implements Comparator<Integer> {

    public static String getOddOcuuredNum(int[] arr) {
        int itt = 0;
        String ans = "";
        int result = 0;
        Arrays.sort(arr); // 3,3,4,4,4,4,5,6,7,7    :: 1,3,2,3,3,1
        for (int i = 0; i < arr.length; i++) {
            result^=arr[i];
            if(result == 0){
                itt = 0;
            }
            else if(itt != 0 && result != 0){
                ans = ans + itt +" ";
                itt = arr[i];
                result = arr[i];}
                else if(itt == 0 && result != 0)
                    itt = arr[i];
            }
            if(itt != 0)
                return ans + itt;
            else
                return ans;
        }

    @Override
    public int compare(Integer o1, Integer o2) {
        return 0;
    }
}