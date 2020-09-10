package Chapter2_gettingStart;

import java.util.Arrays;

public class MergeSort08282020 {
    public int[] mergeSort(int[] array) {
        // Write your solution here
        // Null, empty, one element (BC)
        if(array == null || array.length == 0 || array.length == 1){
            return array;
        }
        int mediumIndex = array.length / 2;

        int[] subListFront = Arrays.copyOfRange(array, 0, mediumIndex);
        int[] subListBack = Arrays.copyOfRange(array, mediumIndex, array.length);

        subListFront = mergeSort(subListFront);
        subListBack = mergeSort(subListBack);

        // Modify the previous array
        int[] resultCopy = mergingSort(subListFront, subListBack);
        for(int i = 0; i < resultCopy.length; i++){
            array[i] = resultCopy[i];
        }
        return array;
    }

    // Precondition: both list are sorted
    public int[] mergingSort(int[] arrayFront, int[] arrayBack){
        int frontIndex = 0;
        int backIndex = 0;
        int resultIndex = 0;
        int[] result = new int[arrayFront.length + arrayBack.length];
        while (frontIndex < arrayFront.length && backIndex < arrayBack.length){
            // Get the smaller value and then add it to the array Result
            if(arrayFront[frontIndex] < arrayBack[backIndex]){
                result[resultIndex] = arrayFront[frontIndex];
                frontIndex++;
            }else{
                result[resultIndex] = arrayBack[backIndex];
                backIndex++;
            }
            resultIndex ++;
        }
        // at most one sublist non-empty
        for(; resultIndex < result.length; resultIndex++){
            if(frontIndex < arrayFront.length){
                result[resultIndex] = arrayFront[frontIndex];
                frontIndex++;
            }else{
                result[resultIndex] = arrayBack[backIndex];
                backIndex++;
            }
        }
        return result;
    }
}
