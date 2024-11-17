import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public static void isValid(String s) {
        int i = 0;
        while (i<s.length()) {
            System.out.println("("+i+","+i/2+")");
            i++;
        }
    }

    public static void removeDuplicates(int[] nums) {
        Set<Integer> uniqueNums = new LinkedHashSet<>();
        for (int num : nums) {
            uniqueNums.add(num);
        }

        for (int num : uniqueNums) {
            System.out.println(num);
        }
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (numToIndex.containsKey(complement)) {
                return new int[] {numToIndex.get(complement), i};
            }
            
            numToIndex.put(nums[i], i);
        }
        
        return new int[] {};
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] result1 = solution.twoSum(new int[] {2, 7, 11, 15}, 9);
        int[] result2 = solution.twoSum(new int[] {3, 2, 4}, 6);
        int[] result3 = solution.twoSum(new int[] {3, 3}, 6);

        // Print the results
        System.out.println("Result 1: [" + result1[0] + ", " + result1[1] + "]");
        System.out.println("Result 2: [" + result2[0] + ", " + result2[1] + "]");
        System.out.println("Result 3: [" + result3[0] + ", " + result3[1] + "]");
    }
}