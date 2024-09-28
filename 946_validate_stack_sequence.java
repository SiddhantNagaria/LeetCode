class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int j = 0;
        Stack<Integer> s = new Stack<>();
        for(int i = 0 ; i < pushed.length; i ++){
            s.push(pushed[i]); 
            while(!s.isEmpty() && j != popped.length){
                if(s.peek() == popped[j]){
                    s.pop(); 
                    j++;
                }else{
                    break;
                }
            }
        }
        return s.isEmpty();
    }
}