package datastructures;
//LeetCode Kth largest integer problem

import java.util.PriorityQueue;
public class kthLargest {
    private int k;
    private PriorityQueue<Integer> minheap;

    public kthLargest(int k, int[] nums){
        this.k = k;
        this.minheap = new PriorityQueue<>();
        for(int num : nums){
            add(num);
            //minheap.add(num) is not used.
        }
    }

    public int add(int val){
        if(minheap.size() < k){
            minheap.offer(val);
        }else if(val > minheap.peek()){
            minheap.poll();
            minheap.offer(val);
        }
        return minheap.peek();
    }
}