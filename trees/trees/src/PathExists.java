import java.util.*;

public class PathExists {
    public class Node{
        private int value;
        private int height;
        private Node left;
        private Node right;
        public Node(int value){
            this.value=value;
        }
        public int getValue(){
            return value;
        }
    }
    boolean findPath(Node node,int[] arr){
        if(node==null) return arr.length==0;
        return helper(node,arr,0);
    }

    private boolean helper(Node node, int[] arr, int index) {
       if(node==null) return false;
       if(index>=arr.length || node.value!=arr[index]) return false;
       if(node.left==null && node.right==null && index==arr.length-1) return true;
       return helper(node.left,arr,index+1) || helper(node.right,arr,index+1);
    }
    public static int countPaths(Node node,int target){
        List<Integer> path=new ArrayList<>();
        return helper(node,target,path);
    }
    private static int helper(Node node, int target, List<Integer> path) {
       if(node==null) return 0;
       path.add(node.value);
       int count=0;
       int s=0;
       // how many paths I can make
        ListIterator<Integer> iterator=path.listIterator(path.size());
        while (iterator.hasPrevious()){
            s+=iterator.previous();
            if(s==target){
                count++;
            }
        }

        count+=helper(node.left,target,path)+helper(node.right,target,path);
        path.remove(path.size()-1);
        return  count;
    }

    // from root to leaf all paths
    public static List<List<Integer>> findAllPaths(Node node,int target){
       List<List<Integer>> paths=new ArrayList<>();
       List<Integer> path=new ArrayList<>();
       pathHelper(node,target,path,paths);
       return paths;
    }
    private static void pathHelper(Node node, int target,List<Integer> path, List<List<Integer>> paths) {
        if(node==null) return;
        path.add(node.value);
        if(node.value==target && node.left==null && node.right==null) {
            paths.add(new ArrayList<>(path));
        }
        else{
            pathHelper(node.left,target-node.value,path,paths);
            pathHelper(node.right,target-node.value,path,paths);
        }
        // backtrack

        path.remove(path.size()-1);
    }

    // DFS using stack
    void dfsStack(Node node){
        if(node==null) return;
        Stack<Node> stack=new Stack<>();
        stack.push(node);
        while (!stack.isEmpty()){
            Node removed=stack.pop();
            System.out.print(removed.value+" ");
            if(removed.right!=null){
                stack.push(removed.right);
            }
            if(removed.left!=null){
                stack.push(removed.left);
            }
        }
    }
}
