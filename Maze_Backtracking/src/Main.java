import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        System.out.println(pathCount(3,3));
//        printPaths("", 3, 3);
//        System.out.println();
//        System.out.println(printPathsList("", 3, 3));
//        System.out.println(printPathsListDiagonal("", 3, 3));
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
//        pathWithRestrictions("", maze, 0, 0);
        int[][] path = new int[maze.length][maze[0].length];
        allPathsPrint("", maze, 0, 0, path, 1);
    }

    static int pathCount(int r, int c){
        if(r == 1 || c == 1){
            return 1;
        }

        int left = pathCount(r - 1, c);
        int right = pathCount(r, c - 1);
        return left+right;
    }

    static void printPaths(String p, int r, int c){
        if(r == 1 && c == 1){
            System.out.print(p+", ");
            return;
        }
        if(r > 1){
            printPaths(p + 'R', r - 1, c);
        }
        if(c > 1){
            printPaths(p + 'D', r, c - 1);
        }
    }


    static ArrayList<String> printPathsList(String p, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
//            System.out.print(p+", ");
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if(r > 1){
            ans.addAll(printPathsList(p + 'R', r - 1, c));
        }
        if(c > 1){
            ans.addAll(printPathsList(p + 'D', r, c - 1));
        }
        return ans;
    }

    static ArrayList<String> printPathsListDiagonal(String p, int r, int c){
        if(r == 1 && c == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
//            System.out.print(p+", ");
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();

        if(r > 1 && c > 1){
            ans.addAll(printPathsListDiagonal(p + 'D', r - 1, c - 1));
        }
        if(r > 1){
            ans.addAll(printPathsListDiagonal(p + 'V', r - 1, c));
        }
        if(c > 1){
            ans.addAll(printPathsListDiagonal(p + 'H', r, c - 1));
        }

        return ans;
    }

    static void pathWithRestrictions(String p, boolean[][] maze, int r, int c){
        if(r == maze.length - 1 && c == maze[0].length - 1){
            System.out.print(p + ", ");
            return;
        }

        if(!maze[r][c]){
            return;
        }
        if(r < maze.length - 1){
            pathWithRestrictions(p + 'D', maze, r + 1, c);
        }

        if (c < maze[0].length - 1){
            pathWithRestrictions(p + "R", maze, r, c + 1);
        }
    }

    static void allPathsPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step){
        if(r == maze.length - 1 && c == maze[0].length - 1){
            for(int[] arr: path){
                path[r][c] = step;
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if (!maze[r][c]){
            return;
        }
        // I consider this block in my path means it will be in my path so make it false;
        maze[r][c] = false;

        path[r][c] = step;
        if(r < maze.length - 1){
            allPathsPrint(p + 'D', maze, r + 1, c, path, step + 1);
        }
        if(c < maze[0].length - 1){
            allPathsPrint(p + 'R', maze, r, c + 1, path, step + 1);
        }
        if(r > 0){
            allPathsPrint(p + 'U', maze, r - 1, c, path, step + 1);
        }
        if(c > 0 ){
            allPathsPrint(p + 'L', maze, r, c - 1, path, step + 1);
        }

        // This is where the function will be over
        // So before the function gets removed, also remove the changes that you made while visiting that cell
        maze[r][c] = true;
        path[r][c] = 0;
    }
}