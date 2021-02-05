class Solution {
    public int findLHS(int[] nums) {
        int len = nums.length, i;
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(i = 0; i < len; i++){
            if(freq.containsKey(nums[i]) == false){
                freq.put(nums[i],1);
            }
            else{
                freq.put(nums[i],freq.get(nums[i])+1);
            }
        }
        int ans = 0;
        for (int key: freq.keySet()) {
            if (freq.containsKey(key + 1))
                ans = Math.max(ans, freq.get(key) + freq.get(key + 1));
        }
        return(ans);
    }
}
