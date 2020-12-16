package controller;

import logic.*;
import model.OneDimensionalArray;
import model.TwoDimensionalArray;

public class Main {

    public static final String FORMAT_MAX_VALUE = "Maximum value is %d%n";
    public static final String FORMAT_AVERAGE_VALUE = "Average value is %.2f%n";

    public static void main(String[] args) {

        OneDimensionalArray array = new OneDimensionalArray(12);
        array.fillArray();
        System.out.println(array);

        // executing first task
        System.out.printf(FORMAT_MAX_VALUE, ArrayMaxValueSearch.getMaxValue(array.getArrayValues()));

        // executing second task
        System.out.printf(FORMAT_AVERAGE_VALUE, ArrayAverageValueSearch.searchAverageValue(array.getArrayValues()));

        // executing third task
        OneDimensionalArray newArray = ArraysCopying.copyArrayFromOld(array);
        System.out.println(newArray);

        // executing fourth task
        ArrayElementsPermutation.permuteElements(newArray);
        System.out.println(newArray);

        // executing fifth task
        TwoDimensionalArray firstArray = new TwoDimensionalArray(3, 3);
        TwoDimensionalArray secondArray = new TwoDimensionalArray(3, 3);

        firstArray.fillArray();
        System.out.println(firstArray);
        secondArray.fillArray();
        System.out.println(secondArray);

        TwoDimensionalArray resultArray = MatrixMultiplication.multiplyMatrix(firstArray.getTwoDimArray(), secondArray.getTwoDimArray());
        System.out.println(resultArray);
    }

}
