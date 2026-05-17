class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int i =0 , j=0 , m1=0 , m2=0;
        for(int count =0 ; count<=(n+m)/2 ;count++){
            m2=m1;
            if(i!=n && j!=m)
            {
                if(nums1[i]>nums2[j]){
                    m1=nums2[j++];
                }
                else
                {
                    m1=nums1[i++];
                }
            }else if(i<n){
                m1=nums1[i++];
            }
            else{
                m1=nums2[j++];
            }

        }
        if((n+m)%2 ==1){
            return (double) m1;
        }
        else{
            double ans = (double)m1 + (double)m2;
            return ans/2.0;
        }
    //     int[] arr = new int[m+n+2];
    //     System.arraycopy(nums1 , 0 , arr , 0 , m+1);
    //     System.arraycopy(nums2 , 0 , arr , m+1 , n+1);
    //     Arrays.sort(arr);
    //     int size = arr.length-1;
    //     int div = size /2;
    //     if(size%2 ==0)      //odd
    //     {
    //         return arr[div];
    //     }
    //     else
    //     {
    //         float median = (arr[div]+arr[div+1])/2.0f;
    //         return median;
    //     }
     }
}