//Shortest Unsorted Continuous Subarray
//Using sort nlogn
class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] temp = nums.clone();
        Arrays.sort(temp);
        int i, st = -1, end = 0, len = nums.length;
        for(i = 0; i < len; i++){
            if(nums[i] != temp[i]){
                if(st == -1){
                    st = i;
                }
                else{
                    end = i;
                }
            }
        }
        if(st == -1){return 0;}
        return end - st + 1;
    }
}
