class Solution {
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray(); // convert string to char array.

        int left = 0;
        int right = s.length() - 1;

        String vowels = "AEIOUaeiou"; // define vowels
        while (left < right) {
            // move left pointer until it finds a vowel
            while (left < right && vowels.indexOf(chars[left]) == -1) {
                left++;
            }
            // move right pointer until it finds a vowel
            while (left < right && vowels.indexOf(chars[right]) == -1) {
                right--;
            }

            // swap the vowels
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }
        return new String(chars); // convert char array back to string
    }
}
