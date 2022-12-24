package binarySearch;

public class ceilingNumber {
    //ceiling of number
    public static void main(String args[]){
        int[] arr = {1,2,4,5,6};

        System.out.println(binarySearch(arr,2));
    }
    static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]>target){
                end = mid-1;
            }
            if(arr[mid]==target){return  mid;}
//            else if(arr[mid]==target && arr[mid+1]==target){
//                if(arr[mid+1]!= target){
//                    return mid;
//                }
//                else{
//                    start = mid +1;

            else{start = mid+1;}
            }return start;


        }
    }

