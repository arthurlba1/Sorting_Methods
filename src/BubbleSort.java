package src;

public class BubbleSort implements Sort{
    @Override
    public int[] sort(int[] nos) {
        int aux;
        for(int i = nos.length - 1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(nos[j] > nos[j + 1]){
                    aux = nos[j];
                    nos[j] = nos[j+1];
                    nos[j+1] = aux;
                }
            }
        }
        return nos;
    }
}
