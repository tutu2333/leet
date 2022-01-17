package array;

public class FirstAndLastPosInSortedArray {

    public int[] searchRange(int[] nums, int target) {
        int leftIndex = binarySearchLeft(nums, target);
        int rightIndex = binarySearchRight(nums, target);
        int[] tmp = new int[]{-1, -1};
        if (leftIndex < 0 || leftIndex >= nums.length ) {
            return tmp;
        }
        if (rightIndex < 0 || rightIndex >= nums.length) {
            return tmp;
        }
        if (nums[leftIndex] != target || nums[rightIndex] != target) {
            return tmp;
        }

        return new int[]{leftIndex, rightIndex};
    }

    public int binarySearchLeft(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid;
        while (left < right) {
            mid = (left + right) / 2;
            if (nums[mid] >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }

    public int binarySearchRight(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid;
        while (left < right) {
            mid = (left + right + 1) / 2;
            if (nums[mid] <= target) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }

}
