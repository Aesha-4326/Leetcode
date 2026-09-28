class Solution {
   // Helper method for exponentiation by squaring
   public double helper(double x, int n) {
       if (n == 0) return 1; // Base case: x^0 = 1
       double temp = helper(x, n / 2); // Recursively compute x^(n/2)
       temp *= temp; // Square the result
       if (n % 2 != 0) temp *= x; // If odd, multiply by x
       return temp;
   }


   public double myPow(double x, int n) {
       if (n < 0) {
           long val = (long) n; // Convert to long to handle edge cases
           double ans = helper(x, (int) -val); // Compute for positive exponent
           return 1.0 / ans; // Return reciprocal for negative exponent
       }
       return helper(x, n);
   }
}
