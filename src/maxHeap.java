public class maxHeap {
    private int[] heap;
    private int maxSize;
    private int size;

    public maxHeap(int maxsize){
        this.maxSize = maxsize;
        this.size = 0;
        heap = new int[maxsize];
    }

    private int parent(int pos){
        return (pos-1)/2;
    }

    private int left(int pos){
        return (pos*2) +1;
    }
    private int right(int pos){
        return (pos*2)+2;
    }
    public boolean isLeaf(int pos){
        return pos >= size/2 && pos < size;
    }

    public void swap(int fpos, int spos){
        int temp = heap[fpos];
        heap[fpos] = heap[spos];
        heap[spos]= temp;
    }
    public void bubbleUp(){
        //aka HeapifyUp
        int cur = size;
        while(cur!=0 && heap[cur] > heap[parent(cur)]){
            swap(cur, parent(cur));
            cur = parent(cur);
        }
    }
    public void add(int val){
        if (size >= maxSize){
            System.out.println("Heap is full!");
            return;
        }
        heap[size] = val;
        size++;
        bubbleUp();
    }
    public void heapifyDown(int pos){
        while(!isLeaf(pos)){
            int left = left(pos);
            int right = right(pos);
            int largest = pos;

            if(left < size && heap[left] > heap[largest]){
                largest=left;
            }
            if(left < size && heap[right] > heap[largest]){
                largest = right;
            }
            if(largest!=pos){
                swap(largest, pos);
                pos = largest;
            }else{
                break;
            }
        }

    }
    public int remove(int pos){
        if (size == 0){
            return Integer.MIN_VALUE;
        }
        int popped = heap[pos];
        heap[0] = heap[--size];
        heapifyDown(0);
        return popped;
    }
}
