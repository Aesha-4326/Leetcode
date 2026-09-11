class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) {
            return true;
        }

        int firstIndex = -1;
        int secondIndex = -1;
        int count = 0;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
                if (count > 2) {
                    return false;
                }
                if (firstIndex == -1) {
                    firstIndex = i;
                } else {
                    secondIndex = i;
                }
            }
        }

        return count == 2 && 
               s1.charAt(firstIndex) == s2.charAt(secondIndex) && 
               s1.charAt(secondIndex) == s2.charAt(firstIndex);
    }
}