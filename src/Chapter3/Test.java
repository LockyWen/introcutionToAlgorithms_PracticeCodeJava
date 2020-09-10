package Chapter3;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7};
        int[] arraySub = Arrays.copyOfRange(array1, 0, 3);
        arraySub[2] = 10;
        for(int i = 0; i < arraySub.length; i++){
            System.out.println(arraySub[i]);
        }
    }
}
