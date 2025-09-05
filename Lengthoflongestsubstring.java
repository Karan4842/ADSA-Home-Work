class Lengthoflongestsubstring {
    public int lengthOfLongestSubstring(String s) {
        if (s == null) return 0;

        // Map to store the most recent index of each character
        java.util.Map<Character, Integer> lastSeen = new java.util.HashMap<>();

        int maxLen = 0;
        int left = 0; // left pointer of sliding window

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            // If character is already in the window, move left pointer
            if (lastSeen.containsKey(c) && lastSeen.get(c) >= left) {
                left = lastSeen.get(c) + 1;
            }

            lastSeen.put(c, right); // update last seen index
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
