public class Q7 {
    // reverse the number
    static int sum=0;
    static void reverse(int n){
        if(n==0){
            return;
        }
        int rem=n%10;
        sum=sum*10+rem;
        reverse(n/10);
    }
    static int reverse2(int n){
        // sometimes you might need some additional variables in the argument , in that case, make another function
       int digits=(int)(Math.log10(n))+1;
       return helper(n,digits);
    }
    static int helper(int n,int digits){
      if(n%10==n){
          return n;
      }
      int rem=n%10;
      return rem*(int)(Math.pow(10,digits-1))+helper(n/10,digits-1);
    }
    // is palindrome
    static boolean isPalindrome(int n){
        return n==reverse2(n);
    }
    public static void main(String[] args) {
//         reverse(1342);
//        System.out.println(sum);
        System.out.println(reverse2(1234));
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(1234));
    }
}
