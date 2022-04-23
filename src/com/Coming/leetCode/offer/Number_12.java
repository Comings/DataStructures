package com.Coming.leetCode.offer;

/**
 * @author Coming
 * @date 2022/3/9 7:54
 */
public class Number_12 {
    public static void main(String[] args) {
        char[][] ch = new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        System.out.println(exist(ch,"ABCCED"));
    }
    public static boolean exist(char[][] board, String word) {
        char[] chars = word.toCharArray();
        int column = board.length;
        int row = board[0].length;
        for(int i=0;i<column;i++){
            for(int j=0;j<row;j++){
                if(dfs(board,chars,i,j,0)) return true;
            }
        }
        return false;
    }

    public static boolean dfs(char[][] board, char[] chars,int i, int j, int k){
        if(i>=board.length || i<0 || j>=board[0].length || j<0 ||board[i][j] !=chars[k]){
            return false;
        }
        if(k==chars.length-1) return true;
        board[i][j] = '\0';
        boolean res = dfs(board,chars,i,j+1,k+1) || dfs(board,chars,i,j-1,k+1)
                || dfs(board,chars,i+1,j,k+1) || dfs(board,chars,i-1,j,k+1);
        board[i][j] = chars[k];
        return res;

    }


}
