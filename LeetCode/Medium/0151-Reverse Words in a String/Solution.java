class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        
        // Split the string by one or more spaces
        String[] words = s.split("\\s+");
        
        // Use StringBuilder to reverse the words
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i != 0) { // Add a single space between words
                result.append(" ");
            }
        }
        
        return result.toString();
    }
}