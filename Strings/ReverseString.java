public class ReverseString {

    public static String reverse(String s) {
        if (s == null) return "";

        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String input = "developer";
        System.out.println("Input  : " + input);
        System.out.println("Output : " + reverse(input));
    }
}
