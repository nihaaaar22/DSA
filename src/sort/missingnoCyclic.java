package sort;
import java.util.Arrays;
public class missingnoCyclic {
    public static void main (String args[]){
        int[] nums = {4,2,1,0};
        int miss = missingNumber(nums);
        System.out.println(miss);
    }
    static int missingNumber(int[] nums) {
        int i = 0;
        while(i<nums.length){
            if(nums[i]!= i && nums[i]<nums.length) {
                swap(nums,i);
            }
            else{i++;}
        }
        for(i=0;i<nums.length;i++){
            if(nums[i]!=i){return i;}
        }
        return nums.length;
    }
    static void swap(int[] arr,int i ){
        int temp = arr[arr[i]];
        arr[arr[i]]= arr[i];
        arr[i]= temp;

    }
}
