//LEETCODE-11

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int maxWater = 0;

        int i = 0;
        int j = height.length-1;

        while(i<j){
            int length = Math.min(height[i], height[j]);
            int width = j-i;
            maxWater = Math.max(maxWater, length*width);

            if(height[i]>height[j]){
                j--;
            }
            else{
                i++;
            }
        }

        return maxWater;
    }
}
