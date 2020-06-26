package Chapter2_gettingStart;
// This is a Test file
import java.util.ArrayList;

public class DemoMain {
    public static void main(String[] args) {
        SetUpList setup = new SetUpList();
        setup.setUpList(new int[]{1, 2, 3, 4, 5}, setup.arr1);
        setup.setUpList(new int[]{5, 4, 3, 2, 1}, setup.arr2);
        setup.setUpList(new int[]{2, 4, 3, 5, 1}, setup.arr3);

        printOutList printer = new printOutList();
        insertionSort is = new insertionSort();
        insertionSort_1 is1 = new insertionSort_1();

        ReverseInsertionSort ris = new ReverseInsertionSort();
        MergeSort ms = new MergeSort();




//        System.out.println(printer.printOut(is.insertSorting(setup.arr1)));
//        System.out.println(printer.printOut(is.insertSorting(setup.arr2)));
//        System.out.println(printer.printOut(is.insertSorting(setup.arr3)));


//        System.out.println(printer.printOut(is1.insertSorting(setup.arr1)));
//        System.out.println(printer.printOut(is1.insertSorting(setup.arr2)));
//        System.out.println(printer.printOut(is1.insertSorting(setup.arr3)));

//        System.out.println(printer.printOut(ris.reversingInsertSorting(setup.arr1)));
//        System.out.println(printer.printOut(ris.reversingInsertSorting(setup.arr2)));
//        System.out.println(printer.printOut(ris.reversingInsertSorting(setup.arr3)));

        System.out.println(printer.printOut((ArrayList<Integer>) ms.mergeSorting(setup.arr1)));
        System.out.println(printer.printOut((ArrayList<Integer>) ms.mergeSorting(setup.arr2)));
        System.out.println(printer.printOut((ArrayList<Integer>) ms.mergeSorting(setup.arr3)));
    }
}

class SetUpList{
    public ArrayList<Integer> arr1 = new ArrayList<>();
    public ArrayList<Integer> arr2 = new ArrayList<>();
    public ArrayList<Integer> arr3 = new ArrayList<>();

    public void setUpList(int[] nums, ArrayList<Integer> arr){
        for(int x: nums){
            arr.add((Integer) x);
        }
    }
}

class printOutList{
    public String printOut(ArrayList<Integer> arr){
        int ktc = 0;
        String result = new String();
        for(; ktc < arr.size(); ktc++){
            result += arr.get(ktc).toString() + "--->";
        }
        return result;
    }
}
