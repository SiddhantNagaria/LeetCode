public class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        // Min-heap to store the elements from the lists along with the list index and element index
        PriorityQueue<Element> minHeap = new PriorityQueue<>(Comparator.comparingInt(e -> e.value));
        
        int max = Integer.MIN_VALUE; // Maximum value in the current range
        int start = 0; // Start of the smallest range
        int end = Integer.MAX_VALUE; // End of the smallest range
        
        // Initialize the heap with the first elements of each list
        for (int i = 0; i < nums.size(); i++) {
            int value = nums.get(i).get(0);
            minHeap.offer(new Element(value, i, 0));
            max = Math.max(max, value); // Update max value
        }
        
        // Continue until we exhaust one of the lists
        while (minHeap.size() == nums.size()) {
            // Get the minimum element from the heap
            Element minElement = minHeap.poll();
            int minValue = minElement.value;
            
            // Update the range if it's smaller than the previous found range
            if (max - minValue < end - start) {
                start = minValue;
                end = max;
            }
            
            // If there's another element in the same list, add it to the heap
            if (minElement.indexInList + 1 < nums.get(minElement.listIndex).size()) {
                int nextValue = nums.get(minElement.listIndex).get(minElement.indexInList + 1);
                minHeap.offer(new Element(nextValue, minElement.listIndex, minElement.indexInList + 1));
                max = Math.max(max, nextValue); // Update max value
            }
        }
        
        return new int[]{start, end};
    }
    
    // Helper class to store elements along with their list index and index in list
    private static class Element {
        int value; // Value of the element
        int listIndex; // Index of the list
        int indexInList; // Index of the element in the list
        
        Element(int value, int listIndex, int indexInList) {
            this.value = value;
            this.listIndex = listIndex;
            this.indexInList = indexInList;
        }
    }
}
