package src;

public class HeapSort implements Sort {
    @Override
    public int[] sort(int[] nos) {
        int size = nos.length;
        int i;
        for (i = size / 2 - 1; i >= 0; i--){
            HeapiFy(nos, size, i);
        }
        for (i=size-1; i>=0; i--){
            int aux = nos[0];
            nos[0] = nos[i];
            nos[i] = aux;
            HeapiFy(nos, i, 0);
        }  
        return nos;
    }

    private void HeapiFy(int[] nos, int size, int i){
        int largest = i;
        int left = 2*i+1;
        int right = 2*i+2;

        if (left < size && nos[left] >nos[largest]){
        largest = left;  
        }
  
        if (right < size && nos[right] > nos[largest]){  
            largest = right;  
        }

        if(largest != i){
            int aux = nos[i];  
            nos[i]= nos[largest];   
            nos[largest] = aux;  
            HeapiFy(nos, size, largest);
        }
    }
}
