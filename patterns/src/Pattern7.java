public class Pattern7 {

    static void pattern(int n){

        for(int i=0;i<n;i++){
            //space
            for(int j=1;j<=(n-i-1);j++){
                System.out.print(" ");
            }
            //star
            for(int k=1;k<=(2*i+1);k++){
                System.out.print("*" );
            }
            //space
            for(int l=1;l<=(n-i-1);l++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        pattern(5);
    }
}
