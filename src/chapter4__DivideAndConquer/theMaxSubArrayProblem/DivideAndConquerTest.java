package chapter4__DivideAndConquer.theMaxSubArrayProblem;

import chapter4__DivideAndConquer.theMaxSubArrayProblem.BruteForceSolutionForMaximumSubarrayProblem;

import java.util.ArrayList;
import java.util.List;

public class DivideAndConquerTest {

    private static List<Integer> stocks1 = new ArrayList<>();
    private static List<Integer> stocks2 = new ArrayList<>();
    private static List<Integer> stocks3 = new ArrayList<>();
    private static List<Integer> stocks4 = new ArrayList<>();
    private static List<Integer> stocks5 = new ArrayList<>();

    private static List<Integer> result = new ArrayList<>();

    public static void main(String[] args) {
        testCases();
        for(int i = 0; i < result.size(); i++){
            System.out.println("The result of stocks" + i + " is: " + result.get(i));
        }
    }

    public static void testCases(){
        setUp();
        BruteForceSolutionForMaximumSubarrayProblem bruteForceSolutionForMaximumSubarrayProblem = new BruteForceSolutionForMaximumSubarrayProblem();
        result.add(bruteForceSolutionForMaximumSubarrayProblem.calculateStock(stocks1));
        result.add(bruteForceSolutionForMaximumSubarrayProblem.calculateStock(stocks2));
        result.add(bruteForceSolutionForMaximumSubarrayProblem.calculateStock(stocks3));
        result.add(bruteForceSolutionForMaximumSubarrayProblem.calculateStock(stocks4));
        result.add(bruteForceSolutionForMaximumSubarrayProblem.calculateStock(stocks5));
    }

    private static void setUp(){
        // stocks1 = {1, 2, 3, 4, 4, 5, 6, 7, 10}
        stocks1.add(1);
        stocks1.add(2);
        stocks1.add(3);
        stocks1.add(4);
        stocks1.add(4);
        stocks1.add(5);
        stocks1.add(6);
        stocks1.add(7);
        stocks1.add(10);

        // stocks2 = {100, 91, 78, 66, 46, 32, 12}
        stocks2.add(100);
        stocks2.add(91);
        stocks2.add(78);
        stocks2.add(66);
        stocks2.add(46);
        stocks2.add(32);
        stocks2.add(12);

        // stocks3 = {10, 11, 7, 10, 6}
        stocks3.add(10);
        stocks3.add(11);
        stocks3.add(7);
        stocks3.add(10);
        stocks3.add(6);

        //stocks4 = {100, 113, 110, 85, 105, 102, 86, 63, 81, 101, 94, 106, 101, 79, 94, 90, 97}
        stocks4.add(100);
        stocks4.add(113);
        stocks4.add(110);
        stocks4.add(85);
        stocks4.add(105);
        stocks4.add(102);
        stocks4.add(86);
        stocks4.add(63);
        stocks4.add(81);
        stocks4.add(101);
        stocks4.add(94);
        stocks4.add(106);
        stocks4.add(101);
        stocks4.add(79);
        stocks4.add(94);
        stocks4.add(98);
        stocks4.add(97);

        // stock5 is empty
    }

}
