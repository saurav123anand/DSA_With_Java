package backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class Maze {
    // counting paths
    static  int count(int r,int c){
        if(r==1 || c==1){
            return 1;
        }
        int left=count(r-1,c);
        int right=count(r,c-1);
        return left+right;
    }
    //printing paths
    static void path(String p,int r,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            path(p+'D',r-1,c);
        }
        if(c>1){
            path(p+'R',r,c-1);
        }
    }

    //printing paths(returning ArrayList)
    static ArrayList<String> path2(String p, int r, int c){
        ArrayList<String> ans=new ArrayList<>();
        if(r==1 && c==1){
            ans.add(p);
            return ans;
        }
        if(r>1){
            ans.addAll(path2(p+'D',r-1,c));
        }
        if(c>1){
            ans.addAll(path2(p+'R',r,c-1));
        }
        return ans;
    }

    //printing paths including diagonal paths also (returning ArrayList)
    static ArrayList<String> path3(String p, int r, int c){
        ArrayList<String> ans=new ArrayList<>();
        if(r==1 && c==1){
            ans.add(p);
            return ans;
        }
        if(r>1 && c>1){
            ans.addAll(path3(p+'D',r-1,c-1));
        }
        if(r>1){
            ans.addAll(path3(p+'V',r-1,c));
        }
        if(c>1){
            ans.addAll(path3(p+'H',r,c-1));
        }
        return ans;
    }

    // maze with obstacles

    static void pathWithObs(String p,boolean maze[][],int r,int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r< maze.length-1){
            pathWithObs(p+'D',maze,r+1,c);
        }
        if(c<maze[0].length-1){
            pathWithObs(p+'R',maze,r,c+1);
        }
    }

    // including all paths (backtracking)
    static void allPaths(String p,boolean maze[][],int r,int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }

        // If I'm considering this block in my path
        maze[r][c]=false;

        if(r< maze.length-1){
            allPaths(p+'D',maze,r+1,c);
        }
        if(c<maze[0].length-1){
            allPaths(p+'R',maze,r,c+1);
        }
        if(r>0){
            allPaths(p+'U',maze,r-1,c);
        }
        if(c>0){
            allPaths(p+'L',maze,r,c-1);
        }
        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made by that function
        maze[r][c]=true;
    }

    // all path print (backtracking)
    static void allPathsPrint(String p,boolean maze[][],int r,int c,int path[][],int step){
        if(r==maze.length-1 && c==maze[0].length-1){
            path[r][c]=step;
            for(int[] arr:path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!maze[r][c]){
            return;
        }

        // If I'm considering this block in my path
        maze[r][c]=false;
        path[r][c]=step;
        if(r< maze.length-1){
            allPathsPrint(p+'D',maze,r+1,c,path,step+1);
        }
        if(c<maze[0].length-1){
            allPathsPrint(p+'R',maze,r,c+1,path,step+1);
        }
        if(r>0){
            allPathsPrint(p+'U',maze,r-1,c,path,step+1);
        }
        if(c>0){
            allPathsPrint(p+'L',maze,r,c-1,path,step+1);
        }
        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made by that function
        maze[r][c]=true;
        path[r][c]=0;
    }


    public static void main(String[] args) {
//        System.out.println(count(3,3));
//        path("",3,3);
//        System.out.println(path2("",3,3));
//        System.out.println(path3("",3,3));
        boolean[][] board={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
//        pathWithObs("",board,0,0);
//        allPaths("",board,0,0);
        int[][] path=new int[board.length][board[0].length];
        allPathsPrint("",board,0,0,path,1);

    }
}
