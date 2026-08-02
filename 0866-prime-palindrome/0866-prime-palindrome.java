class Solution {
    public int primePalindrome(int n) {
        if (n >= 8 && n <= 11) {
            return 11;
        }

        
        for (int i = 1; i < 100000; i++) {
            String s = Integer.toString(i);
            
            StringBuilder sb = new StringBuilder(s);
            for (int j = s.length() - 2; j >= 0; j--) {
                sb.append(s.charAt(j));
            }
            
            int palindrome = Integer.parseInt(sb.toString());

            if (palindrome >= n && isPrime(palindrome)) {
                return palindrome;
            }
        }

        return -1;
    }

    private boolean isPrime(int num) {
        if (num < 2){
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}