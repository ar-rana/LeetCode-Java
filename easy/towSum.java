import java.util.HashMap;

class twoSumSolution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i=0;i<nums.length;i++) {
            int val = target-nums[i];
            if (hash.containsKey(val)){
                return new int[] { hash.get(val), i };
            }
            else
                hash.put(nums[i], i);
        }
        return null;
    }
}