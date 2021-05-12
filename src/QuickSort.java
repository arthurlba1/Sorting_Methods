package src;

public class QuickSort implements Sort{
    @Override
    public int[] sort(int[] nos) {
        int beg = 0;
        int end = nos.length;

        if(end > beg){
            int indexPivot = slice(nos, beg, end);
            end = indexPivot -1;
            sort(nos);
            beg = indexPivot +1;
            sort(nos);
        }
        return nos;
    }

    private int slice(int[] nos, int beg, int end){
        int pivot, dLeft, dRight = end;
        dLeft = beg + 1;
        pivot = nos[beg];
        
        while(dLeft <= dRight) {
            while(dLeft <= dRight && nos[dLeft] <= pivot) {
                dLeft++;
            }
            while(dRight >= dLeft && nos[dRight] > pivot) {
                dRight--;
            }
            if(dLeft < dRight) {
                change(nos, dRight, dLeft);
                dLeft++;
                dRight--;
              }
            }
        
            change(nos, beg, dRight);
            return dRight;
        }
        private void change(int[] nos, int i, int j) {
            int temp = nos[i];
            nos[i] = nos[j];
            nos[j] = temp;
          }
    }

