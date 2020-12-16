package logic;

import model.OneDimensionalArray;

import java.util.Arrays;

public class ArraysCopying {

    public static OneDimensionalArray copyArrayFromOld(OneDimensionalArray oldArray) {
        int oldArrayLength = oldArray.getArrayValues().length;
        OneDimensionalArray newArray = new OneDimensionalArray(oldArrayLength + 5);
        newArray.setArrayValues(Arrays.copyOf(oldArray.getArrayValues(), newArray.getArrayValues().length));

        return newArray;
    }

}
