import java.util.*;
import java.util.List;

public class Solution{
    public static void main(String[] args) throws Exception {
        int[] nums1 = {1, 2, 3, 4};
        int count=0;
        System.out.println("\nOriginal array: "+Arrays.toString(nums1));
        List<List<Integer>> result1 = new Solution().permute(nums1);
        System.out.println("In the following arrangements, 3 indicates 3-5.");
        result1.forEach(System.out::println);
        int[] nums2 = {1, 2, 5, 4};
        List<List<Integer>> result2 = new Solution().permute(nums2);
        System.out.println("In the following arrangements, 5 indicates 5-3.");
        result2.forEach(System.out::println);	
        System.out.println("Number of Possible arrangements such that guest3 and guest5 always sit together is = "+ result1.size()*2);

    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Permutation(0, nums, result);
        return result;
    }

    private void Permutation(int i, int[] nums, List<List<Integer>> result) {
        if (i == nums.length - 1) {
        List<Integer> list = new ArrayList<>();
        for (int n : nums) list.add(n);
        result.add(list);
        } else {
        for (int j = i, l = nums.length; j < l; j++) {
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
            Permutation(i + 1, nums, result);
            temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
            }
        }
    }
}