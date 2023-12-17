public class PrimeNumberII {
    public static void primeRange(int n){
          for (int i=1;i<n;i++){
              boolean primeCheck=isPrime(i);
              System.out.println(i+" : "+primeCheck);
          }
    }
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        primeRange(40);
    }
}
