package binarySearch;

public class search {
    public static void main(String[] args) {

        System.out.println(search());

    }
    static int search(){

        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = -1;

        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
