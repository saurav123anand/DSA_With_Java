public class Q3 {
    // find factorial of a number
    static int fac(int n){
        if(n==1){
            return 1;
        }
        return n*fac(n-1);
    }
    public static void main(String[] args) {
        System.out.println(fac(5));
    }
}
