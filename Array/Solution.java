public class Solution {
    public static void twoSum (int[] nums, int target) {
        int L = 0;
        int R = nums.length - 1;

        while (L < R) {
            int sum = nums[L] + nums[R];

            if (sum == target) {
                System.out.println("Pair found: " + nums[L] + ", " + nums[R]);
            }
            if (sum < target) {
                L++; // Move L pointer to the R
            } else {
                R--; // Move R pointer to the L
            }
        }
        System.out.println("No pair found");
    }

    public static void main(String[] args) {
        String str = "Hello, World!";
String subStr = str.substring(7, 12); // Extracts "World"
System.out.println(subStr);

    }
}