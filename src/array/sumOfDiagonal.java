package array;

public class sumOfDiagonal {
    public static void main(String args[]){
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int ans = diagonalSum(arr);
        System.out.println(ans);


    }
    static int diagonalSum(int[][] mat) {
        int loop= 0;
        int sum = 0;
        for(int i = 0;i<mat.length;i++){
            sum += mat[i][i];
        }
        int row = 0;
        int col = mat.length-1;
        while(loop<mat.length){

            if(row != col){sum += mat[row][col];}
            row++;
            col--;
            loop++;
        }
        return sum;
    }
}
