package binarySearch;
public class infiniteArray {
    public static void main (String args[]){
        int[] arr = {1,2,3,4,5,8,9,13,15,16,18,28,29,30,35,37,38,45,47,57,68,78,89,95,96,97,123,145,145};
        int target = 45;
        int start = 0;
        int end = 1;
        int size = 1;
        int ans = func(arr,target,start,end,size);
        System.out.println(ans);


    }
    static int func(int[] arr,int target,int start, int end, int size){

        if(target<=arr[end]){
           return binarySearch(target,start,end,arr);
        }
        else{
            size = size*2;
            start = end +1;
            end = start + size;
            return func(arr,target,start,end,size);

        }

    }
    static int binarySearch(int target,int start,int end,int[] arr){
        while(start<= end){
            int mid = (start+end)/2;
            if(arr[mid]== target){
                return mid;
            }
            else if(arr[mid]<target){
                start = mid +1;
            }
            else{
                end = mid-1;
            }
        }return -1;
    }
}
