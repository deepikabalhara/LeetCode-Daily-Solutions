class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int min=nums[0];

        for(int i =0;i<n;i++)
        {
            if(min>nums[i]){
                min=nums[i];
            }
            //System.out.println("array was rotated" + i+1 + "times");
        }
        
        return min;
    }
}