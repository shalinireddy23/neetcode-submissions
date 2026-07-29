class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length(), n2 = s2.length();
        if (n1 > n2) return false;

        int[] s1Count = new int[26];
        int[] s2Count = new int[26];

        // Build frequency for s1 and first window of s2
        for (int i = 0; i < n1; i++) {
            s1Count[s1.charAt(i) - 'a']++;
            s2Count[s2.charAt(i) - 'a']++;
        }

        // Count initial matches
        int matches = 0;
        for (int i = 0; i < 26; i++) {
            if (s1Count[i] == s2Count[i]) matches++;
        }

        int l = 0;
        for (int r = n1; r < n2; r++) {

            // ✅ If all match → permutation found
            if (matches == 26) return true;

            int index = s2.charAt(r) - 'a';
            s2Count[index]++;

            if (s2Count[index] == s1Count[index]) {
                matches++;
            } else if (s2Count[index] == s1Count[index] + 1) {
                matches--;
            }

            index = s2.charAt(l) - 'a';
            s2Count[index]--;

            if (s2Count[index] == s1Count[index]) {
                matches++;
            } else if (s2Count[index] == s1Count[index] - 1) {
                matches--;
            }

            l++;
        }

        return matches == 26;
    }
}