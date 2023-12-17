import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.*;


public class Test {
    public static List<List<Integer>> findPrimePairs(int n) {
        boolean[] primes=sieve(n);
        List<List<Integer>> result=new ArrayList<>();
        for (int i = 2; i <=n/2; i++) {
            if(!primes[i] && !primes[n-i] && (i<=n-i)){
                result.add(new ArrayList<>(Arrays.asList(i,n-i)));
            }
        }
        return result;
    }
    public static boolean[] sieve(int n){
        boolean[] primes = new boolean[n + 1];
        List<Integer> list=new ArrayList<>();
        // false in array means prime
        for (int i=2;i*i<=n;i++){
            // if(!primes[i]){
            for (int j = 2*i; j <=n; j+=i) {
                primes[j]=true;
            }
            // }
        }
        return primes;
    }

    public static void main(String[] args) {
        System.out.println(findPrimePairs(10));
    }
}
