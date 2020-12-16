package model;

import util.RandomIntValueGenerator;

import java.util.Arrays;

public class TwoDimensionalArray {
    private int[][] twoDimArray;

    public TwoDimensionalArray(final int arrayOneLength, final int arrayTwoLength) {
        twoDimArray = new int[arrayOneLength][arrayTwoLength];
    }

    public void fillArray() {
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                twoDimArray[i][j] = RandomIntValueGenerator.getRandomValue();
            }
        }
    }

    public int[][] getArray() {
        return twoDimArray;
    }

    @Override
    public String toString() {
        return "twoDimArray values =" + Arrays.toString(twoDimArray) + '}';
    }
}

