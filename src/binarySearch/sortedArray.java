package binarySearch;

public class sortedArray {
    public static void main(String[] args) {
        int arr[][] =  {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16},
        };
        int target = 11;
        System.out.println(search(target,arr));

    }
    static int[] binarySearch (int[][] arr,int target, int colstart,int colend,int row){
        while(colstart<=colend){
            int middle = colstart+(colend-colstart)/2;
            if(arr[row-1][middle]==target){
                return new int[]{row,middle};

            }
            if (arr[row-1][middle]>target){
                colend = middle-1;
            }
            if(arr[row-1][middle]<target){
                colstart =middle+1;
            }
        }return new int[]{-1,-1};
    }
    static int[] search (int target,int[][] arr){
        int rows = arr.length;
        int col = arr[0].length;
        int rowstart = 0;
        int colstart = 0;
        int cmid = col/2;
        if(rows== 0){
           return binarySearch(arr,target,0,col-1,0);
        }
        while(rowstart<rows-1){
            int mid = rowstart + (rows-rowstart)/2;
            if(arr[mid][cmid]==target){
                return new int[]{mid,cmid};
            }
            if(target>arr[mid][cmid]){
                rowstart = mid ;
            }
            if(target<arr[mid][cmid]){
                rows = mid;
            }

        }
        //now we have two rows
        //now check whether the target is in the col of 2 rows
        if (arr[rowstart][cmid]==target) {
            return new int[]{rowstart,cmid};

        }
        if(arr[rows-1][cmid]==target){
            return new int[]{rows-1,cmid};
        }
        //search in 1st half
        //search in 2nd half
        //search in 3rd half
        //search in 4th half

        if(target<=arr[rowstart][cmid-1]){
            return binarySearch(arr,target,colstart,cmid-1,rowstart);
        }
        if(target>=arr[rowstart][cmid+1]&&target<=arr[rowstart][col]){
            return binarySearch(arr,target,cmid+1,col-1,rowstart);
        }
        if(target<=arr[rows][cmid-1]){
            return binarySearch(arr,target,cmid-1,col,rows);
        }
        if(target>=arr[rows][cmid+1]&&target<=arr[rows][col]){
            return binarySearch(arr,target,cmid+1,col,rows);

        }
        return new int[]{-1,-1};



    }
}
