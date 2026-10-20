class MedianFinder {
    private PriorityQueue<Integer> maxHeap;
    private PriorityQueue<Integer> minHeap;
    public MedianFinder() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    }
    
    public void addNum(int num) {
        maxHeap.add(num);
        if(!minHeap.isEmpty()&& maxHeap.peek()>minHeap.peek()){
            minHeap.add(maxHeap.poll());
            
        }
        if(maxHeap.size()-minHeap.size()>1){
            minHeap.add(maxHeap.poll());
        }
        else if(minHeap.size()-maxHeap.size()>1){
            maxHeap.add(minHeap.poll());
        }
    }
    
    public double findMedian() {
        if(minHeap.size()>maxHeap.size()) return (double) minHeap.peek();
        if(maxHeap.size()>minHeap.size()) return (double) maxHeap.peek();
        return ((minHeap.peek()+maxHeap.peek())/2.0);
    }
}
