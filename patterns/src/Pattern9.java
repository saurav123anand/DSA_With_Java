public class Pattern9 {
    static void pattern(int n){

        for(int i=0;i<n;i++){
            //space
            for(int j=1;j<=(n-i-1);j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=(2*i+1);j++){
                System.out.print("*" );
            }
            //space
            for(int j=1;j<=(n-i-1);j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            //space
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            //star
            for(int j=0;j<(2*n-(2*i+1));j++){
                System.out.print("*" );
            }
            //space
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        pattern(5);
    }
}
