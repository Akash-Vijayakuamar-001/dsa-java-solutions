import java.util.Stack;

public class NextGreaterElement {

    // Time: O(n), Space: O(n)
    public static int[] nextGreater(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>(); // store indices

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }

            result[i] = stack.isEmpty() ? -1 : arr[stack.peek()];
            stack.push(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 25};
        int[] ans = nextGreater(arr);

        for (int x : ans) System.out.print(x + " ");
        // Output: 5 25 25 -1
    }
}
