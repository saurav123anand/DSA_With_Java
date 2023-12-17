public class Q6 {
    // product of digits
    static int productOfDigits(int n){
        if(n%10==n){
            return n;
        }
        return (n%10)*productOfDigits(n/10);
    }
    public static void main(String[] args) {
        System.out.println(productOfDigits(1342));
    }
}
