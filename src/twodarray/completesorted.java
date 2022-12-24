package twodarray;

import java.util.Arrays;

public class completesorted {
    public static void main(String args[]){
        int arr[][] = {{1,2,3},
        {4,5,6},{7,8,9}};
        int target = 4;
        System.out.println(Arrays.toString(search(arr,target)));
    }

    static int[] binarySearch(int[][] arr,int target,int row,int colS,int colE){

        while(colS<=colE){

            int mid = (colS+colE)/2;
            if(arr[row][mid]==target){return new int[] {row,mid}; }
            else if(target<arr[row][mid]){colE = mid-1;}
            else{colS = mid+1;}

        }return new int[] {-1,-1};
    }
    static int[] search(int[][] arr,int target){
        int rows = arr.length-1;
        int rowStart = 0;
        int colStart = 0;
        int cols = arr.length-1;
        int cmid = (colStart+cols)/2;
        //take care there might only be one row
        if(rows==0){return binarySearch(arr,target,0,0,arr[0].length);}
        while(rowStart<rows-1){//this while condition will return 2 rows
            int mid = (rowStart+rows)/2;
            if(arr[mid][cmid]==target){
                return new int[]{mid,cmid};
            }
            else if(arr[mid][cmid]<target){rowStart = mid;}
            else{rows = mid;}
        }
        if(arr[rowStart][cmid]==target){return new int[]{rowStart,cmid};}
        if (arr[rows][cmid]==target){

            return new int[]{rows,cmid};
        }
        if(target<=arr[rowStart][cmid-1]){

             return binarySearch(arr,target,rowStart,0,cmid-1);

        }
        if(target>=arr[rowStart][cmid+1] && target<= arr[rowStart][cols]){
            return binarySearch(arr,target,rowStart,cmid+1,cols);
        }
        if(target<=arr[rowStart+1][cmid-1]){
            return binarySearch(arr,target,rowStart+1,colStart,cmid-1);
        }
        else{
            return binarySearch(arr,target,rowStart+1,cmid+1,cols);

        }


    }
}
