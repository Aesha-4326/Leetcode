class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;

        for (int i = 0; i < weights.length; i++) {
            low = Math.max(low, weights[i]);
            high += weights[i];
        }

        int ans = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canShip(weights, days, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    private boolean canShip(int[] weights, int days, int capacity) {
        int currentDays = 1;
        int currentWeight = 0;

        for (int i = 0; i < weights.length; i++) {
            if (currentWeight + weights[i] > capacity) {
                currentDays++;
                currentWeight = 0;
            }
            currentWeight += weights[i];
        }

        return currentDays <= days;
    }
}
