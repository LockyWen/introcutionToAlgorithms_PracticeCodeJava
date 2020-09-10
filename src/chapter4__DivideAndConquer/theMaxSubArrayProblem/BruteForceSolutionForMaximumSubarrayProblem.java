package chapter4__DivideAndConquer.theMaxSubArrayProblem;

import java.util.List;

public class BruteForceSolutionForMaximumSubarrayProblem {

    //Step one: Precondition: Input an ArrayList of Integer
    //      Edge cases: null, empty all return 0
    //      Use brute force
    //  Postcondition: return int: the maximum difference


    public int calculateStock(List<Integer> stocks){
        int maxDif = 0;
        if(stocks == null || stocks.size() <= 1){
            return maxDif;
        }
        for(int i = 0; i < stocks.size(); i++){
            if(maxDif < findMinDifForEachStock(i, stocks)){
                maxDif = findMinDifForEachStock(i, stocks);
            }
        }

        return maxDif;
    }

    /**
     * Fix a stock at the <index> of the array, then find the max dif for such stock
     * @param index the index of the stock
     * @param stocks a list of price of stocks
     * @return the max dif
     */
    private int findMinDifForEachStock(int index, List<Integer> stocks){
        int result = 0;
        for(int i = index; i < stocks.size(); i++){
            int difToCheck = stocks.get(i) - stocks.get(index);
            if(result < difToCheck){
                result = difToCheck;
            }
        }
        return result;
    }
}
