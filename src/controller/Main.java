package controller;

import logic.ArrayAverageValueSearch;
import logic.ArrayElementsPermutation;
import logic.ArrayMaxValueSearch;
import logic.ArraysCopying;
import model.OneDimensionalArray;

public class Main {

    public static void main(String[] args) {

        OneDimensionalArray array = new OneDimensionalArray(12);
        array.fillArray();
        System.out.println(array);

        // executing first task
        System.out.printf("Maximum value is %d%n", ArrayMaxValueSearch.getMaxValue(array.getArrayValues()));

        // executing second task
        System.out.printf("Average value is %.2f%n", ArrayAverageValueSearch.searchAverageValue(array.getArrayValues()));

        // executing third task
        OneDimensionalArray newArray = ArraysCopying.copyArrayFromOld(array);
        System.out.println(newArray);

        // executing fourth task
        ArrayElementsPermutation.permuteElements(newArray);
        System.out.println(newArray);

        // executing fifth task
    }

}
