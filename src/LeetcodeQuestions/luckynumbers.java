package LeetcodeQuestions;

import java.util.ArrayList;
import java.util.List;

public class luckynumbers {
    //Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.
    //
    //A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.
    public List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0; i<matrix.length;i++){
            int colmin = mincolinrow(matrix,i);
            if(ifmaxincol(matrix,colmin,i)){ans.add(matrix[i][colmin]);}
        }
        return ans;
    }
    static int mincolinrow(int[][] matrix,int row){
        int minindex = 0;
        for(int i=1;i<matrix[row].length;i++){
            if(matrix[row][i]<matrix[row][minindex]){
                minindex = i;
            }

        }return minindex;
    }
    static boolean ifmaxincol(int[][] matrix,int col,int row){

        for(int i = 0;i<matrix.length;i++){
            if(matrix[i][col]>matrix[row][col]){
                return false;
            }
        }return true;
    }
}
