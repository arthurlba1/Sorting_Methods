package src;

public class ShellSort implements Sort{
    @Override
    public int[] sort(int[] nos) {

        for(int gap = nos.length/2; gap > 0; gap /=2){
            for(int i = gap; i < nos.length; i++){
                int aux = nos[i];
                int j;
                for (j = i; j >= gap && nos[j - gap] > aux; j -= gap)
                nos[j] = nos[j - gap];

                nos[j] = aux;
            }
        }
        return nos;
    }
}
