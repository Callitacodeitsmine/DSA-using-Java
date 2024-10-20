
public class Remove_Duplicates_from_Sorted_Array {
    public static int removeDuplicates(int[] nums)  {
        int a = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != nums[a]){
                a++;
                nums[a] = nums[i];
            }
        }
        return a+1;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,2};
        int b = removeDuplicates(nums);

        System.out.println(b);
        for(int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
        }
    }
}