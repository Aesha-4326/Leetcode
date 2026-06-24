class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = 0;
        
        for (int i = 0; i < nums.length; i++) {
            high = Math.max(high, nums[i]);
        }
        
        int ans = high;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (getSum(nums, mid) <= threshold) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        return ans;
    }
    
    private int getSum(int[] nums, int divisor) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {

            sum += (nums[i] + divisor - 1) / divisor;
        }
        return sum;
    }
}