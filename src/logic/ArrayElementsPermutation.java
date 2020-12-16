package logic;

import model.OneDimensionalArray;

public class ArrayElementsPermutation {

    public static void permuteElements(OneDimensionalArray array) {
        for (int i = 0; i < array.getArrayValues().length / 2; i++) {
            int tmp = array.getArrayValues()[i];
            array.getArrayValues()[i] = array.getArrayValues()[array.getArrayValues().length - i - 1];
            array.getArrayValues()[array.getArrayValues().length - i - 1] = tmp;
        }
    }
}
