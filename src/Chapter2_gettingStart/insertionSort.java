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

// Source code from ArrayList<>.add. This shows that how add is in O(n)
//    /**
//     * Inserts the specified element at the specified position in this
//     * list. Shifts the element currently at that position (if any) and
//     * any subsequent elements to the right (adds one to their indices).
//     *
//     * @param index index at which the specified element is to be inserted
//     * @param element element to be inserted
//     * @throws IndexOutOfBoundsException {@inheritDoc}
//     */
//    public void add(int index, E element) {
//        rangeCheckForAdd(index);
//        modCount++;
//        final int s;
//        Object[] elementData;
//        if ((s = size) == (elementData = this.elementData).length)
//            elementData = grow();
//        System.arraycopy(elementData, index,
//                elementData, index + 1,
//                s - index);
//        elementData[index] = element;
//        size = s + 1;
//    }

