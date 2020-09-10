package Chapter2_gettingStart;

import java.util.ArrayList;

public class ReverseInsertionSort {
    public ArrayList<Integer> reversingInsertSorting(ArrayList<Integer> inputList){
        for(int j=1; j < inputList.size(); j++){
            insertingNum(j, inputList);
        }
        return inputList;
    }

    //Insert each step
    // Precondition: 0 <= index < len(modifiedList) && modifiedList[0: index] is in sorted order
    private void insertingNum(Integer index, ArrayList<Integer> modifiedList){
        Integer targetNum = modifiedList.get(index);
        for(int i = 0; i < index; i++){
            if( targetNum >= modifiedList.get(i)){
                modifiedList.remove(targetNum);
                modifiedList.add(i, targetNum);
                return;
            }
        }
        return;
    }
}
