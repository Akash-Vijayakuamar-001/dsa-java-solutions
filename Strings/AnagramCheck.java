public class AnagramCheck {

    public static boolean isAnagram(String s1, String s2) {
        if (s1 == null || s2 == null) return false;

        s1 = s1.replaceAll("\\s+", "").toLowerCase();
        s2 = s2.replaceAll("\\s+", "").toLowerCase();

        if (s1.length() != s2.length()) return false;

        int[] freq = new int[26]; 

        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
            freq[s2.charAt(i) - 'a']--;
        }

        for (int count : freq) {
            if (count != 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent"));   // true
        System.out.println(isAnagram("triangle", "integral")); // true
        System.out.println(isAnagram("rat", "car"));         // false
    }
}
