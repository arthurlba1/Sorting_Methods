package src;

public class SelectionSort implements Sort {
    @Override
    public int[] sort(int[] nos) {

        for (int i = 0; i < nos.length - 1; i++){
            int index = i;
            for(int j = i+1; j < nos.length; j++){
                if (nos[j] < nos[index]){  
                    index = j;
                }
            }
            int smallerNumber = nos[index];
            nos[index] = nos[i];
            nos[i] = smallerNumber;
        }  
        return nos;
    }
}
