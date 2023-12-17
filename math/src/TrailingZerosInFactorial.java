public class TrailingZerosInFactorial {
    static long factorial(int n){
        if(n==0 || n==1){
            return n;
        }
        return  n*factorial(n-1);
    }

    static int countTrailingZeros(int n){
        long facto=factorial(n);
        int count=0;
        while(n!=0){
            long last=facto%10;
            if(last==0){
                count++;
            }
            n=n/10;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countTrailingZeros(100));
    }
}
