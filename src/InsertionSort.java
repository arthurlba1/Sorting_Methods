package src;

public class InsertionSort implements Sort{
    @Override
    public int[] sort(int[] nos) {

        for (int j = 1; j < nos.length; j++){
            int key = nos[j];
            int i = j-1;
            while((i > -1) && (nos[i] > key)){
                nos[i+1] = nos[i];
                i--;
            }
            nos[i+1] = key;
        }

        return nos;
    }
}
