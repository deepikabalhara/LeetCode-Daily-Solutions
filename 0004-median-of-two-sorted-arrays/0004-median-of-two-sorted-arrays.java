class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length-1;
        int n = nums2.length-1;
        int[] arr = new int[m+n+2];
        System.arraycopy(nums1 , 0 , arr , 0 , m+1);
        System.arraycopy(nums2 , 0 , arr , m+1 , n+1);
        Arrays.sort(arr);
        int size = arr.length-1;
        int div = size /2;
        if(size%2 ==0)      //odd
        {
            return arr[div];
        }
        else
        {
            float median = (arr[div]+arr[div+1])/2.0f;
            return median;
        }


        // for(int i =0;i<=m;i++){
        //     for(int j =0;j<=n;j++){
        //         arr[i]=
        //     }
        // }
        // int div = (m+n)/2;
        // //for even 
        // if(m<div)
        // {
        //     int even = (nums2[div-m]+nums2[div-m+1])/2 ;
        // }
        // else{

        // }
    }
}