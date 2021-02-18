//Container With Most Water
class Solution {
    public int maxArea(int[] height) {
        int str = 0;
        int end = height.length - 1;
        int ans = (end) * Math.min(height[str], height[end]);
        while(str != end){
            if(height[str] <= height[end]){str++;}
            else{end--;}
            ans = Math.max(ans,(end-str) * Math.min(height[str], height[end]));
        }
        return ans;
    }
}
