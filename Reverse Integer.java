class Solution {
   
    public int reverse(int x) {
      
        if(x==0)
        {
            return 0;
        }
        int temp=x,rev=0;
        boolean sign=true;
        if(x<0)
        {
            sign=false;
            temp=-(temp);
        }
        while(temp>0)
        {
            int r=temp%10;
            if (rev > (Integer.MAX_VALUE - r) / 10) {
                return 0;
            }
            rev= (rev*10)+r;
            temp/=10;
        }
        if(sign==false)
        {
            rev=-(rev);
        }
        return rev;

    }
}
