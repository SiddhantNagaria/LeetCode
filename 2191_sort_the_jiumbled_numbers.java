class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        int n=nums.length;
        List<Pair> ll=new ArrayList<>();
        for(int i=0;i<n;i++){
            String str=Integer.toString(nums[i]);
            String mappedStr=mapper(str,mapping);
            int mappedNum=Integer.parseInt(mappedStr);
            ll.add(new Pair(mappedNum,i));
        }
        Collections.sort(ll,(a,b)->Integer.compare(a.mappedNum,b.mappedNum));
        int [] result =new int [n];
        for(int i=0;i<n;i++){
            int oriindex=ll.get(i).originalIndex;
            result[i]=nums[oriindex];
        }
        return result;
    }
    private String mapper(String str,int [] mapping){
        StringBuilder sb=new StringBuilder();
        for(char ch:str.toCharArray()){
            sb.append(mapping[ch-'0']);
        }
        return sb.toString();
    }
    private static class Pair{
        int mappedNum;
        int originalIndex;
        Pair(int mappedNum,int originalIndex){
            this.mappedNum=mappedNum;
            this.originalIndex=originalIndex;
        }
    }
}