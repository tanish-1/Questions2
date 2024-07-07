package rev.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class MazeProblems {
//    static ArrayList<String> allpaths(int r , int c, String res, ArrayList<String> li){
//        if (r == 1 && c==1){
//            li.add(res);
//            return li;
//        }
//        r,c =
//        if(r>1 && c>1){
//            allpaths(r-1,c-1,res+"Di",li);
//        }
//
//        if(r>1){
//            allpaths(r-1,c,res+"D",li);
//        }
//        if (r<=3) {
//            allpaths(r+1,c,res+"L",li);
//        }
//        if (c<=3) {
//            allpaths(r,c+1,res+"U",li);
//        }
//        if (c>1){
//            allpaths(r,c-1,res+"R",li);
//        }
//        return li;
//    }
static void matrixpath(boolean[][] arr , int r , int c , int[][] path , int step){
    if(r== arr.length-1 && c == arr[0].length-1){
        path[r][c] = step;
        for (int[] value : path){
            System.out.println(Arrays.toString(value));
            }
        System.out.println();
        return;
    }

    if (!(arr[r][c])){
        return;
    }
    arr[r][c] = false;
    path[r][c] = step;
    if (r<arr.length-1){
        matrixpath(arr,r+1,c,path,step+1);
    }
    if (c<arr[0].length-1){
        matrixpath(arr,r,c+1,path,step+1);
    }
    if (c>0) {
        matrixpath(arr,r,c-1,path,step+1);
    }
    if (r>0) {
        matrixpath(arr,r-1,c,path,step+1);
    }
    arr[r][c] = true;
    path[r][c] = 0;
}
    static ArrayList<String> allmazeWithPrblm(boolean[][] arr , int r , int c , String res ,ArrayList<String> li){
        if(r== arr.length-1 && c == arr[0].length-1){
            li.add(res);
            return li;
        }

        if (!(arr[r][c])){
            return li;
        }
        arr[r][c] = false;
        if (r<arr.length-1){
            allmazeWithPrblm(arr,r+1,c,res+"D",li);
        }
        if (c<arr[0].length-1){
            allmazeWithPrblm(arr,r,c+1,res+"R",li);
        }
        if (c>0) {
            allmazeWithPrblm(arr,r,c-1,res+"L",li);
        }
        if (r>0) {
            allmazeWithPrblm(arr,r-1,c,res+"U",li);
        }
        arr[r][c] = true;
        return li;
    }
    static ArrayList<String> mazeWithPrblm(boolean[][] arr , int r , int c , String res ,ArrayList<String> li){
        if(r== arr.length-1 && c == arr[0].length-1){
            li.add(res);
            return li;
        }

        if (!(arr[r][c])){
            return li;
        }
        if (r<arr.length-1){
            mazeWithPrblm(arr,r+1,c,res+"D",li);
        }
        if (c<arr[0].length-1){
            mazeWithPrblm(arr,r,c+1,res+"R",li);
        }

        return li;
    }
    static ArrayList<String> paths(int r , int c, String res, ArrayList<String> li){
        if (r == 1 && c==1){
            li.add(res);
            return li;
        }
        if(r>1 && c>1){
            paths(r-1,c-1,res+"Di",li);
        }

        if(r>1){
           paths(r-1,c,res+"D",li);
        }
        if (c>1){
            paths(r,c-1,res+"R",li);
        }
        return li;
    }
    static int count(int r , int c){
        if(r== 1 || c == 1){
            return 1;
        }
        int left = count(r-1 , c);
        int right = count(r , c-1);
        return left + right;
    }
    public static void main(String[] args) {

        System.out.println(count(3,3));
        System.out.println(paths(3,3,"",new ArrayList<String>()));
        boolean[][] arr = {
                {true , true , true},
                {true , false , true},
                {true , false , true}
        };
        System.out.println(mazeWithPrblm(arr,0,0,"",new ArrayList<>()));
//        System.out.println(allpaths(3,3,"",new ArrayList<>()));
        boolean[][] arr2 = {
                {true , true , true},
                {true , true , true},
                {true ,  true, true}
        };
        System.out.println(allmazeWithPrblm(arr2,0,0,"",new ArrayList<>()));
      matrixpath(arr2,0,0,new int[arr2.length][arr2[0].length],1);
    }
}
