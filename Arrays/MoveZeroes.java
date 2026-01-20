public class MoveZeroes {

    // Move all zeros to end while maintaining relative order of non-zero elements.
    // Time: O(n), Space: O(1)
    public static void moveZeroes(int[] nums) {
        int insertPos = 0;

        for (int x : nums) {
            if (x != 0) {
                nums[insertPos++] = x;
            }
        }

        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);

        for (int x : nums) System.out.print(x + " ");
        // Output: 1 3 12 0 0
    }
}
