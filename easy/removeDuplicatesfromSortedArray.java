class removeDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i=1;i<nums.length;i++) {
            if(nums[i-1] != nums[i]) {
                nums[k] = nums[i-1];
                k++;
            }
        }
        nums[k] = nums[nums.length -1];
        return k+1;
    }
}