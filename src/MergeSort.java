package src;

public class MergeSort implements Sort {
    
    @Override
    public int[] sort(int[] nos) {
        int beg = 0;
        int end = nos.length;

        if(beg < end){
            int mid = (beg+end)/2;
            sort(nos);
            beg = mid +1;
            sort(nos);
            Merge(nos, beg, mid, end);
        }
        return nos;
    }
    private void Merge(int[] nos, int beg, int mid, int end){
        int l = mid - beg + 1;  
        int r = end - mid;  
  
        int LeftArray[] = new int [l];  
        int RightArray[] = new int [r];  

        for (int i=0; i<l; i++){
            LeftArray[i] = nos[beg + i];
        }

        for(int j=0;j<r; j++){
            RightArray[j] = nos[mid + 1+ j];
        }

        int i = 0, j = 0;  
        int k = beg;  
        while (i<l && j<r){
            if (LeftArray[i] <= RightArray[j]){
                nos[k] = LeftArray[i];  
                i++;
            } else {
                nos[k] = RightArray[j];  
                j++;  
            }
            k++;
        }
        while (i<l){
            nos[k] = LeftArray[i];  
            i++;  
            k++;  
        }
        while (j<r){
            nos[k] = RightArray[j];  
            j++;  
            k++;  
        }
    }
}
