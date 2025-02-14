import java.util.Arrays;

public class PermutationInString {
    public static boolean checkInclusion(String s1, String s2) {
        // If s1 is longer than s2, it's impossible for s2 to contain a permutation of s1
        if (s1.length() > s2.length()) return false;

        // Create frequency arrays for storing character counts (26 lowercase letters)
        int[] s1Count = new int[26];
        int[] s2Count = new int[26];

        // Populate s1Count with the frequency of characters in s1
        for (char c : s1.toCharArray()) {
            s1Count[c - 'a']++;
        }

        int windowSize = s1.length(); // Window size is equal to the length of s1
        
        // Iterate through s2 using a sliding window approach
        for (int i = 0; i < s2.length(); i++) {
            // Add the current character to the window
            s2Count[s2.charAt(i) - 'a']++;

            // If the window exceeds the size of s1, remove the leftmost character
            if (i >= windowSize) {
                s2Count[s2.charAt(i - windowSize) - 'a']--;
            }

            // Compare the frequency arrays; if they match, a permutation is found
            if (Arrays.equals(s1Count, s2Count)) {
                return true;
            }
        }

        // No permutation match found
        return false;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(checkInclusion("ab", "eidbaooo")); // Output: true
        System.out.println(checkInclusion("ab", "eidboaoo")); // Output: false
    }
}
