package nmu.sau.fishbakh.k.k.labtwo;

import java.util.Arrays;

public class MatrixManager {

    public Matrix createArray(int randRange, int rowsCount, int colsCount) {
        int rand;
        Matrix matrix = new Matrix(rowsCount, colsCount, randRange);
        int[][] arr = new int[rowsCount][colsCount];
        matrix.setArr(arr);

        for (int i = 0; i < rowsCount; i++) {
            for (int j = 0; j < colsCount; j++) {
                rand = (int) (Math.random() * randRange - randRange / 2);
                arr[i][j] = rand;
            }
        }

        return matrix;
    }

    public void displayArray(Matrix matrix) {

        System.out.println("My array:");

        for (int[] anArr : matrix.getArr()) {
            System.out.println(Arrays.toString(anArr));
        }
    }

    public int sumOfArray(Matrix matrix) {
        int[][] arr = matrix.getArr();
        int sum = 0;
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    public int findMaxOfArray(Matrix matrix) {
        int[][] arr = matrix.getArr();
        int maximum = arr[0][0];
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i][j] > maximum) {
                    maximum = arr[i][j];
                }
            }
        }
        return maximum;
    }

    public int findMinOfArray(Matrix matrix) {
        int[][] arr = matrix.getArr();
        int minimum = arr[0][0];

        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i][j] < minimum) {
                    minimum = arr[i][j];
                }
            }
        }
        return minimum;

    }

}
