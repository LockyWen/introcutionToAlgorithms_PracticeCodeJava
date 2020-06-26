package Chapter2_gettingStart;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    int size1;
    List<Integer> result;

    MergeSort(){}

    // Recursion Rule
    // mergesort the sublist then add together

    /**
     * a recursion method that separate the list to two parts, self-sort both parts and then add them together.
     * @param unsortedList an unsorted list input
     * @return return a sorted list
     */
    public List<Integer> mergeSorting(List<Integer> unsortedList){
        if(unsortedList.size() <= 1){
            return unsortedList;
        }else{
            size1 = (int) Math.floor(unsortedList.size()/2);
            List<Integer> sub1 = (List<Integer>) unsortedList.subList(0, size1);
            List<Integer> sub2 =  (List<Integer>) unsortedList.subList(size1, unsortedList.size());
            sub1 = mergeSorting(sub1);
            sub2 = mergeSorting(sub2);
            result = mergeTwoList(sub1, sub2);
            return  result;
        }
    }

    /**
     * Merge two sorted list into a big sorted list
     * @param list1 an sorted sublist
     * @param list2 an sorted sublist
     * @return the merge sorted list of the combination of both sorted list
     */
    public List<Integer> mergeTwoList(List<Integer> list1, List<Integer> list2){
        int i = 0;
        int j = 0;
        List<Integer> result = new ArrayList<>();

        while(i < list1.size() && j < list2.size()){
            if(list1.get(i) >= list2.get(j)){
                result.add(list2.get(j));
                j ++;
            }else{
                result.add(list1.get(i));
                i++;
            }
        }

        for(; j<list2.size();j++){
            result.add(list2.get(j));
        }
        for (; i<list1.size();i++){
            result.add(list1.get(i));
        }
        return result;

    }
}
