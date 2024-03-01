import java.util.ArrayList;
import java.util.List;

public class Q10 {
    // linear search
    static boolean search(int[]arr,int target,int index){
        if(index==arr.length){
            return false;
        }
        return arr[index]==target || search(arr,target,index+1);
    }
    static int findIndex(int[]arr,int target,int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return findIndex(arr,target,index+1);
    }
    static int findIndexLast(int[]arr,int target,int index){
        if(index==-1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return findIndex(arr,target,index-1);
    }
    static ArrayList<Integer> arrayList=new ArrayList<>();
    static void findAllIndexes(int[]arr,int target,int index){
        if(index==arr.length){
            return;
        }
        if(arr[index]==target){
            arrayList.add(index);
        }
        findAllIndexes(arr,target,index+1);
    }
    // returning ArrayList
    static List<Integer> findAllIndex(int[]arr, int target, int index, List<Integer> list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return findAllIndex(arr,target,index+1,list);
    }
    // passing in body
    static ArrayList<Integer> findAllIndex2(int[]arr, int target, int index){
        ArrayList<Integer> list=new ArrayList<>();
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls=findAllIndex2(arr,target,index+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
    public static void main(String[] args) {
//        int[] arr={3,2,1,18,9};
//        System.out.println(search(arr,18,0));
//        System.out.println(findIndex(arr,18,0));
        //int[] arr2={3,2,1,18,9,18,4,3,18,34,18};
//        findAllIndexes(arr2,18,0);
//        System.out.println(arrayList);
//        System.out.println(findAllIndex(arr2,18,0,new ArrayList<>()));
        int[] arr={1,2,3,4,4,8};
//        System.out.println(findAllIndex2(arr,4,0));
//        System.out.println(findIndex(arr,4,0));
        System.out.println(findAllIndex2(arr,4,0));
    }
}
