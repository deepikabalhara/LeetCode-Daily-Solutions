class Solution {
    public boolean isGood(int[] nums) {
        int n = nums.length;
        //sorting
        Arrays.sort(nums);
        int max = nums[n-1];
        if(n!=max+1){
            return false;
        }
        int[] base = new int[max+1];
        for(int i = 0 ; i < max ;i++ ){
            base[i]=i+1;

        }
        base[max]=max;
        Arrays.sort(base);
        if(Arrays.equals(nums,base)){
            return true;
        }
        else{
            return false;
        }
    }
}