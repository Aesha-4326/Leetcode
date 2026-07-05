class Solution {
    public int vowelConsonantScore(String s) {
        
        int vowels = 0;
        int consonants = 0;

        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        if (consonants == 0) {
            return 0;
        }

        return vowels / consonants;
    }
}