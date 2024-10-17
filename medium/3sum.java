package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class threeSumSolution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for (int i=0; i<nums.length; i++ ) {
            if (i>0 && nums[i-1] == nums[i])
                continue;
            int r = nums.length - 1;
            int l = i+1;
            while(l<r) {
                int sum = nums[i]+nums[l]+nums[r];
                if (sum  > 0){
                    r--;
                } else if (sum < 0) {
                    l++;
                }
                else if (sum == 0) {
                    list.add(new ArrayList<>(Arrays.asList(nums[i], nums[l], nums[r])));
                    l++;
                    while(nums[l] == nums[l-1] && l<r){
                        l++;
                    }
                }
            }
        }

        return list;
    }
}