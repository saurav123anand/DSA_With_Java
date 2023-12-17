public class Test {

    public static int findSum(int A[],int N)
    {
        //code here
        return helper1(A,0,Integer.MIN_VALUE)+helper2(A,0,Integer.MAX_VALUE);
    }
    public static int helper1(int[] arr,int index,int max){
        if(index==arr.length){
            return max;
        }
        if(arr[index]>max){
            return helper1(arr,index+1,arr[index]);
        }
        return helper1(arr,index+1,max);
    }
    public static int helper2(int[] arr,int index,int min){
        if(index==arr.length){
            return min;
        }
        if(arr[index]<min){
            return helper2(arr,index+1,arr[index]);
        }
        return helper2(arr,index+1,min);
    }

    public static void main(String[] args) {
        int[] arr={2,3,4,5,6};
        System.out.println(findSum(arr,5));
    }
}
