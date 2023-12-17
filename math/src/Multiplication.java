public class Multiplication {
    public static void main(String[] args) {
        String output="";
        int n=4;
        int multiply=2;
        int carry=0;
        while(n!=0 || carry!=0){
            int last=n%10;
            int multi=last*multiply;
            int mul=multi+carry;
            if(mul>9){
                carry=mul/10;
            }
            else{
                carry=0;
            }
            n=n/10;
            output=mul%10+output;
        }
        int num=0;
        for(int i=0;i<output.length();i++){
            num=(num*10)+(output.charAt(i)-'0');
        }
        System.out.println(num);
    }
}
