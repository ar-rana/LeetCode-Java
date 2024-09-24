package medium;

import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int steps = Integer.MAX_VALUE;
        int result = 0;
        for (int i=0;i<nums.length;i++) {
            if (i>0 && nums[i-1] == nums[i])
                continue;
            int l = i+1;
            int r = nums.length - 1;
            while(l<r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == target)
                    return sum;
                if (sum > target)
                    r--;
                if (sum < target)
                    l++;
                int diff = Math.abs(target-sum);
                if(diff < steps) {
                    result = sum;
                    steps = diff;
                }
            }
        }
        return result;
    }
}
