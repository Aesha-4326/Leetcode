class Solution {
    public int singleNonDuplicate(int[] nums) {
        int xr = 0;

        for(int i=0; i<nums.length; i++){
            xr = xr^nums[i];
        }
        return xr;
    }
}