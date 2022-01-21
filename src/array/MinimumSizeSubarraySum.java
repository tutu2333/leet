package array;

public class MinimumSizeSubarraySum {

    public int minSubArrayLen(int target, int[] nums) {

        int result = Integer.MAX_VALUE;
        int len = nums.length;
        int sum = 0;
        int left = 0;

        for(int right = 0; right < len; right++) {
            sum += nums[right];
            while (sum >= target) {
                result = Math.min((right - left + 1), result);
                sum -= nums[left++];
            }
        }

        return result == Integer.MAX_VALUE ? 0 : result;
    }

}
