class Solution {
    public List<Integer> getRow(int rowIndex) {
       List<Integer> triangle =new ArrayList<>();
        for(int i=0; i<=rowIndex; i++){
            triangle.add(1);
            for(int j=i-1; j>0; j--){
                triangle.set(j, triangle.get(j) + triangle.get(j-1));
            }
        }
        return triangle;
    }
            
    }
