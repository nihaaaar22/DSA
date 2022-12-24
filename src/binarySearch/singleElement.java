package binarySearch;

public class singleElement {
    public static void main(String[] args){
        int[] nums =new int []{7,7,10,10,11,14,14};
        int ans = singleNonDuplicate(nums);
      System.out.println(ans);
    }
    static int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length -1;
        if (nums[start]!=nums[start+1]) {return nums[start];
        }
        else if (nums[end]!=nums[end-1]) {return nums[end];}
        else if(nums.length==0){return nums[0];}
        while(start<end){
            int mid = start + ((end-start)/2);
            if(mid % 2 != 0){ mid --;}
            if(nums[mid] != nums[mid+1]){end=mid;}
            else{start = mid +2;}

        }return nums[start];
    }

}
