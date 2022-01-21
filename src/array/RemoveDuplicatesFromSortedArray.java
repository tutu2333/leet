package array;

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {

        if (nums.length < 2) {
            return nums.length;
        }

        int slow = 1;
        int fast = 1;
        while (fast < nums.length) {
            if (nums[fast] != nums[fast - 1] ) {
                nums[slow++] = nums[fast];
            }
            fast++;
        }
        return slow;
    }

}
