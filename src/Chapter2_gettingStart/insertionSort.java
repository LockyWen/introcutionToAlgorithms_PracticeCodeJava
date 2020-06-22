package Chapter2_gettingStart;

import java.util.ArrayList;

public class insertionSort {

    ArrayList<Integer> result = new ArrayList<>();  // Please remember to setUp the ArrayList At the beginning or in the constructor
    // Else, the object would be null.

    public ArrayList<Integer> insertSorting(ArrayList<Integer> unsortList) {
        result = new ArrayList<>();
        if(unsortList.size() <= 1) {
            return unsortList;
        }
        result.add(0, unsortList.get(0));
        int x = 1;
        for(; x < unsortList.size(); x++){
            Integer a = unsortList.get(x);
            inserting(unsortList.get(x), result);

        }

        return result;
    }

    public ArrayList<Integer> inserting(Integer num, ArrayList<Integer> sortedList) {
        int i = 0;
        if ((int) num < sortedList.get(i)) {
            sortedList.add(i, num);
            i++;
            return sortedList;
        }
        for (;i < sortedList.size(); i++) {
            if (num < sortedList.get(i)) {
                sortedList.add(i, num);
                return sortedList;
            }
        }
        if(sortedList.get(sortedList.size() -1) < num){
            sortedList.add(sortedList.size(), num);
        }
        return sortedList;
}

}

