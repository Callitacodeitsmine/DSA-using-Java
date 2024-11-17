public class two_pointer {
    public static void TWO_pointer(int[] nums, int key) {
        int R = 0;
        int L = nums.length - 1;

        while(R<L){
            int sum = nums[R] + nums[L];

            if(sum == key){
                System.out.println("("+R+" , "+L+")");
                break;
            }
            else if(sum < key){
                R++;
            }
            else{
                L--;
            }
        }
        System.out.println("null");
    }

    public static void rd(int[] nums){
        int i = 0;
        for(int j = 1; j<nums.length; j++){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
            else{
                nums[j] = -1;
            }
        }
        for (int a = 0; a < nums.length; a++) {
            if (nums[a] == -1) {
                System.out.print("_");
            } else {
                System.out.print(nums[a] + " ");
            }
        }
    }

    public class Solution {
        public static int[] twoSum(int[] nums, int target) {
             int L = 0;
             int R = nums.length - 1;
     
             while (L < R) {
                 int sum = nums[L] + nums[R];
     
                 if (sum == target) {
                     System.out.println("Pair found: " + nums[L] + ", " + nums[R]);
                     return;
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
           int[] nums = {3,2,4};
           System.out.println(twoSum(nums, 6));
        }
     }
    public static void main(String[] args) {
        int[] nums = {1,1,6,7,1,5,9,8,7,6};
        rd(nums);
    }
}
