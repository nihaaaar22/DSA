package recursion;


public class binarySearch {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,23,25,26,28};
        int ans  = binarySearch(arr,28,0,arr.length-1);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr,int target,int start,int end){
        if(start>end){return -1;}
        int mid = (start+end)/2;
        if(arr[mid]==target){return mid;}
        else if(arr[mid] > target){
        return binarySearch(arr, target,start,mid-1);}
        else{return binarySearch(arr, target,mid+1,end);}
    }
}
