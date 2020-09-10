package Chapter2_gettingStart;

import java.util.ArrayList;

/**
 * Precondition: A sequence of n numbers
 * PostCondition: Return Input List modified with non-decreasing order
 * We should modify the list.
 */

/**
 * 9 --> 8 --> 10--> 6 # index = 1
 * 8 --> 9 --> 10 --> 6  # index = 2
 * 8 --> 9 --> 10 --> 6  # index = 3
 * 6 --> 8 --> 9 --> 10
 */
public class insertionSort {

    public ArrayList<Integer> insertionSort(ArrayList<Integer> inputList){
        for(int j=1; j < inputList.size(); j++){ // n - 1 times
            insertingNum(j, inputList);
        }
        return inputList;
    }
    // O(n^2)
    // 1 + 2 + ... n \in O(n^2)

    //Insert each step
    // Precondition: 0 <= index < len(modifiedList) && modifiedList[0: index] is in sorted order
    private void insertingNum(Integer index, ArrayList<Integer> modifiedList){
        Integer targetNum = modifiedList.get(index);
        for(int i = 0; i < index; i++){    // j times
            if( targetNum <= modifiedList.get(i)){
                modifiedList.remove(targetNum);
                modifiedList.add(i, targetNum);
                return;
            }
        }
        return;
    }
}

