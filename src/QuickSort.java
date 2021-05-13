package src;
import java.util.*;

public class QuickSort implements Sort{
 
    @Override
    public int[] sort(int[] nos) {
        int low = 0;
        int high = nos.length-1;
        qSort(nos, low, high);
        return nos;
    }
    private static int slice(int nos[], int low, int high){
        int pivot = nos[high];
  
        int i = (low - 1);
        for (int j = low; j <= high - 1; j++) {
            if (nos[j] <= pivot) {
                i++;

                int temp = nos[i];
                nos[i] = nos[j];
                nos[j] = temp;
            }
        }
  
        int temp = nos[i + 1];
        nos[i + 1] = nos[high];
        nos[high] = temp;
  
        return i + 1;
    }

    private static void qSort(int nos[], int low, int high){
        int[] stack = new int[high - low + 1];
        int top = -1;
        stack[++top] = low;
        stack[++top] = high;

        while(top >= 0){
            high = stack[top--];
            low = stack[top--];

            int p = slice(nos, low, high);

            if(p-1 > low){
                stack[++top] = low;
                stack[++top] = p - 1;
            }
            if (p + 1 < high) {
                stack[++top] = p + 1;
                stack[++top] = high;
            }
        }
    }
}

