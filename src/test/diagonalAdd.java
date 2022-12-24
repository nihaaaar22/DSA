package test;

public class diagonalAdd {
    public static void main(String[] args) {
        int num[][]={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int ans = diagonals(num);
        System.out.println(ans);
    }
    public static int diagonals(int num[][]) {
        int n = num.length-1;
        int s1 = 0;
        for(int i=0;i<= n;i++){
            s1 += num[i][i];
        }
        int s2=0;
        int row = 0;
        int col = n;
        while(col>=0){
            s2+=num[row][col];
            row ++;
            col --;

        }
        return s1+s2;
    }
}
