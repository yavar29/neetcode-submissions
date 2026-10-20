class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        for(Integer stone: stones){
            heap.add(stone);
        }

        while(heap.size()>1){
            int x = heap.poll();
            int y = heap.peek();
            if(x==y) heap.poll();
            else{
                heap.poll();
                heap.add(x-y);
            }
        }
        if(heap.size()==0) return 0;
        return heap.peek();
    }
}
