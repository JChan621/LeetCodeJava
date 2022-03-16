//https://leetcode.com/problems/two-sum
import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++){
            if (hmap.containsKey(nums[i])){
                return new int[]{i, hmap.get(nums[i])};
            }
            else{
                hmap.put(target - nums[i], i);
            };
        };
        return new int[]{-1};
    }
}
