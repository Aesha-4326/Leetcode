class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        
        int low = 1;
        int high = 0;
        
        for (int i = 0; i < quantities.length; i++) {
            high = Math.max(high, quantities[i]);
        }
        
        int ans = high;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (canDistribute(mid, quantities, n)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        return ans;
    }
    
    private boolean canDistribute(int maxCapacity, int[] quantities, int n) {
        int storesNeeded = 0;
        
        for (int i = 0; i < quantities.length; i++) {

            storesNeeded += (quantities[i] + maxCapacity - 1) / maxCapacity;
        }
        
        return storesNeeded <= n;
    }
}