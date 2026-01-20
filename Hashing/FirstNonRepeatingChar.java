import java.util.HashMap;

public class FirstNonRepeatingChar {

    public static char firstNonRepeating(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();

        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        for (char ch : s.toCharArray()) {
            if (freq.get(ch) == 1) return ch;
        }

        return '\0'; // indicates none found
    }

    public static void main(String[] args) {
        String s = "aabbccdeff";
        char result = firstNonRepeating(s);

        if (result == '\0') {
            System.out.println("No non-repeating character found");
        } else {
            System.out.println("First non-repeating character: " + result); // d
        }
    }
}
