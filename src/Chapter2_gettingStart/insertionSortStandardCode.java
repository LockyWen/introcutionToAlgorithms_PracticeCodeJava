package Chapter2_gettingStart;

import java.util.ArrayList;

public class insertionSortStandardCode {
    Integer key;
    int i;
    insertionSortStandardCode(){}

    public ArrayList<Integer> insertSorting(ArrayList<Integer> unsortList){
        for(int j = 0; j < unsortList.size(); j++){
            key = unsortList.get(j);
            i = j - 1;
            while (i >= 0 && unsortList.get(i) > key){
                unsortList.set(i + 1, unsortList.get(i));
                i --;
            }
            unsortList.set(i + 1, key);
        }

        return unsortList;
    }
}
