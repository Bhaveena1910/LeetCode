class Solution {
     public static int gcd(int a , int b ){
        if(a==b){
            return a;
        }
        if(a>b){
            return gcd(a-b, b);
        }else{
            return gcd(a, b-a);
        }
    }
    public int findGCD(int[] nums) {
         int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int n : nums){
            if(n>max){
                max = n;
            }
            if(n<min){
                min = n;
            }
        }
        
        return gcd(max,min);
    }
}
