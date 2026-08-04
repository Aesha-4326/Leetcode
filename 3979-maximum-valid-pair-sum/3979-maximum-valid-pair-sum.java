class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int maxSoFar = nums[0];
        int maxSum = Integer.MIN_VALUE;

        for (int j = k; j < nums.length; j++) {
            maxSoFar = Math.max(maxSoFar, nums[j - k]);
            
            maxSum = Math.max(maxSum, maxSoFar + nums[j]);
        }

        return maxSum;
    }
}