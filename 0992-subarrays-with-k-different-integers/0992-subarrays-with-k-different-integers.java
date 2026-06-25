class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atmost(nums, k) - atmost(nums,k-1);
    }
    public int atmost(int[] nums, int k){
        int startIdx=0, endIdx=0;
        int unique=0, count=0;
        int[] frequency = new int[nums.length+1]; //frequency of number. [1,2,1,3,4] here idx=2 freq=2

        while(endIdx < nums.length){
            if(frequency[nums[endIdx]] == 0){
                unique++;
            }
            frequency[nums[endIdx]]++;
            endIdx++;

            while(unique > k){
                if(frequency[nums[startIdx]] == 1){
                    unique--;
                }
                frequency[nums[startIdx]]--;
                startIdx++;
            }

            count += (endIdx-startIdx);
        }
        return count;
    }
}