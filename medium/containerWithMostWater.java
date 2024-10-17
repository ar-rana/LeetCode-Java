package medium;

class containerWithMostWater {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int max = 0;
        while(l<r) {
            if (height[l] <= height[r]) {
                max = Math.max(max, (r-l)*height[l]);
                l++;
            } else {
                max = Math.max(max, (r-l)*height[r]);
                r--;
            }
        }
        return max;
    }
}
