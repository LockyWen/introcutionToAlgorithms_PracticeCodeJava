package Chapter2_gettingStart;

import java.util.ArrayList;

public class ReverseInsertionSort {
    Integer key;
    int i;
    ReverseInsertionSort(){}

    public ArrayList<Integer> reversingInsertSorting(ArrayList<Integer> unsortList){
        for(int j = 0; j < unsortList.size(); j++){
            key = unsortList.get(j);
            i = j - 1;
            while (i >= 0 && unsortList.get(i) < key){
                unsortList.set(i + 1, unsortList.get(i));
                i --;
            }
            unsortList.set(i + 1, key);
        }

        return unsortList;
    }
}
