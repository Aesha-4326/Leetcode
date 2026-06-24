class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        
        if ((long) m * k > bloomDay.length) {
            return -1;
        }

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        int ans = -1;

        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] < low) {
                low = bloomDay[i];
            }
            if (bloomDay[i] > high) {
                high = bloomDay[i];
            }
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canMakeBouquets(bloomDay, mid, m, k)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    private boolean canMakeBouquets(int[] bloomDay, int days, int m, int k) {
        int bouquets = 0;
        int consecutiveFlowers = 0;

        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= days) {
                consecutiveFlowers++;

                if (consecutiveFlowers == k) {
                    bouquets++;
                    consecutiveFlowers = 0;
                }
            } else {
                consecutiveFlowers = 0;
            }
        }

        return bouquets >= m;
    }
}