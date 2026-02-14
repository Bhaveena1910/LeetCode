class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int s1=0,s2=0;
        for(int i=0;i<n;i++)
        {
            s1+=nums[i];
        }
        s2=(n*(n+1))/2;
        int diff=s2-s1;
        return diff;
    }
}
