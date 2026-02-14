class Solution {
    public boolean hasGroupsSizeX(int[] deck) 
  {
      
        int n = deck.length;
        int[] counts = new int[10000]; 
        int maxCard = 0;

       
        for (int card : deck) 
        {
            counts[card]++;
            if (card > maxCard) maxCard = card;
        }

        int gcd = 0;
        for (int i = 0; i <= maxCard; i++) 
        {
            if (counts[i] > 0) {
                gcd = gcd(gcd, counts[i]);
            }
        }

        return gcd >= 2;
    }

    public static int gcd(int a, int b) {
        if (a == 0) return b;
        return gcd(b % a, a);
    }

    
}
