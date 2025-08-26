class Solution {
    public String reverseWords(String s) {
        // Step 1: trim leading and trailing spaces
        s = s.trim();

        // Step 2: split by one or more spaces (regex)
        String[] words = s.split("\\s+");

        // Step 3: reverse
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) sb.append(" ");
        }

        return sb.toString();
    }
}
