class Solution {
    public int coinChange(int[] coins, int amount) {
          if (amount == 0) {
            return amount;
        }
        
        if (coins.length == 1) {    
            if (amount % coins[0] == 0) {
                return amount / coins[0];
            } else {
                return -1;
            }
        }
   
        Arrays.sort(coins); 
        
        int numberOfWays = 0; 
        
        for (int i = coins.length - 1; i >= 0; i--) {
            if (coins[i] <= amount) {
                numberOfWays += (amount / coins[i]); 
                amount -= (coins[i] * (amount / coins[i]));
            }
        }
         
        return numberOfWays == 0 ? -1 : numberOfWays;
    }
}