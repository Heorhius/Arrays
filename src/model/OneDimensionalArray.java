package model;

import util.RandomIntValueGenerator;

import java.util.Arrays;

public class OneDimensionalArray {

    private int[] arrayValues;

    public OneDimensionalArray(final int arrayLength) {
        arrayValues = new int[arrayLength];
    }

    public void fillArray() {
        for (int i = 0; i < arrayValues.length; i++) {
            arrayValues[i] = RandomIntValueGenerator.getRandomValue();
        }
    }

    public int[] getArrayValues() {
        return arrayValues;
    }

    public void setArrayValues(int[] arrayValues) {
        this.arrayValues = arrayValues;
    }

    @Override
    public String toString() {
        return "OneDimensionalArray values =" + Arrays.toString(arrayValues) + '}';
    }
}
