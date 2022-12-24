package com.company;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int [][] matrix = {
                {10,20,30,40},
                {15,25,35,45},
                {20,30,37,48},
                {35,46,56,67},
        };
        int target = 37;
        System.out.println(Arrays.toString(twoDSearch(matrix,target)));
	// write

    }
    static int[] twoDSearch (int[][]matrix,int target){
        int row = 0;
        int col = matrix.length-1;
        while(row< matrix.length && col>= 0){
            if(matrix[row][col]==target) {
                return new int[]{row, col};

            }
            if(matrix[row][col]>target){
                col--;
            }
            if(matrix[row][col]<target){
                row++;
            }

        }
        return new int[]{-1,-1};
    }

}
