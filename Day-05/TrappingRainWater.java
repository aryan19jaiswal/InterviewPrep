//LEETCODE-42

public class TrappingRainWater {
    public int trap(int[] height) {
        int left = 0;
        int right = height.length-1;

        int ans = 0;

        int lmax = 0;
        int rmax = 0;

        while(left<right){
            if(height[left]<height[right]){
                if(height[left]>lmax){
                    lmax = height[left];
                }
                else{
                    ans += Math.max(lmax, height[left]) - height[left];
                }
                left++;
            }
            else{
                if(height[right]>rmax){
                    rmax = height[right];
                }
                else{
                    ans += Math.max(rmax, height[right]) - height[right];
                }
                right--;
            }
        }

        return ans;
    }
}
