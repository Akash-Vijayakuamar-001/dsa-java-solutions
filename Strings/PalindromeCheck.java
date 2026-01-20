package Strings;

public class PalindromeCheck {

    public static boolean isPalindrome(String s) {
        if (s == null) return false;

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            // skip non-alphanumeric characters
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) left++;
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) right--;

            char c1 = Character.toLowerCase(s.charAt(left));
            char c2 = Character.toLowerCase(s.charAt(right));

            if (c1 != c2) return false;

            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "madam";
        String s2 = "A man, a plan, a canal: Panama";

        System.out.println(s1 + " -> " + isPalindrome(s1)); // true
        System.out.println(s2 + " -> " + isPalindrome(s2)); // true
    }
}
