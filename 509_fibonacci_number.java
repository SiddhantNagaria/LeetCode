class Solution {
    public int fib(int n) {
        if(n<=1)return n;
        if(n==2)return 1;
        return fib(n-1) + fib(n-2);
    }
}

//or

class Solution {
    private int[] dp = new int[31];
    public int fib(int n) {
        if(n <= 1) return n;
        if(n==2) return 1;
        memoize(n);
        return dp[n];
    }
    public int memoize(int n){
        if(dp[n]!=0) return dp[n];
        if(n<3) return 1;
        else
            dp[n]= memoize(n-1)+ memoize(n-2);
        return memoize(n);
    }
}
//memoization method


//or 

//Optimized Solution
class Solution{
    public int fib(int N){
        if(N<=1){
           return N;
        }
        if(N==2){
            return 1;        
        }
        int current =0;
        int prev1=1;
        int prev2=1;
        for(int i=3;i<=N;i++){
            current=prev1+prev2;
            prev1=prev2;
            prev2=current;
        }
        return current;
    }
}