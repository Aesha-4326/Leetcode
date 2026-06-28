class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int prefixSum = 0;
        int count = 0;
        int remainderFreq[] = new int[k];
        remainderFreq[0] = 1;

        for(int i = 0; i < nums.length; i++){
            prefixSum += nums[i];
            int remainder = ((prefixSum % k) + k) % k;
            count += remainderFreq[remainder];
            remainderFreq[remainder]++;
        }
        return count;
    }
}