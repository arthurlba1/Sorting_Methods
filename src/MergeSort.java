package src;

public class MergeSort implements Sort {
    
    @Override
    public int[] sort(int[] nos) {
        if(nos.length > 1){
            int mid = nos.length/2;

            int[]left = new int[mid];
            for(int i = 0; i < mid; i++){
                left[i] = nos[i];
            }
            int[] right = new int[nos.length - mid];
            for(int i = mid; i < nos.length; i++)
            {
                right[i - mid] = nos[i];
            }
            sort(left);
            sort(right);

            int i = 0;
            int j = 0;
            int k = 0;

            while(i < left.length && j < right.length){
                if(left[i] < right[j]){
                    nos[k] = left[i];
                    i++;
                } else {
                    nos[k] = right[j];
                    j++;
                }
                k++;
            }
            while(i < left.length){
                nos[k] = left[i];
                i++;
                k++;
            }
            while(j < right.length){
                nos[k] = right[j];
                j++;
                k++;
            }
        }
        return nos;
    }
}
