package nmu.sau.fishbakh.k.k.labone;//Подключение встроенных методов

import java.util.Arrays;


public class Lab1 {

    final static int n = 4;
    final static int m = 4;
    final static int randRange = 50;


    public static void main(String[] args) {
        int[][] ArrayOfInt = new int[n][m];
        int rand;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                rand = (int) (Math.random() * randRange - randRange / 2);
                ArrayOfInt[i][j] = rand;
            }
        }
        System.out.println("My array:");

        for (int[] anArr : ArrayOfInt) {
            System.out.println(Arrays.toString(anArr));
        }

        System.out.println("Sum of my array:");
        int sum = 0;

        for (int[] anArr : ArrayOfInt) {
            sum += Arrays.stream(anArr).sum();
        }
        System.out.println(sum);

        System.out.println("Max of my array:");
        int[] maximumsArr = new int[ArrayOfInt.length];
        for (int i = 0; i < ArrayOfInt.length; i++) {
            maximumsArr[i] = Arrays.stream(ArrayOfInt[i]).max().getAsInt();
        }
        System.out.println(Arrays.stream(maximumsArr).max().getAsInt());

        System.out.println("Min of my array:");
        int[] minimumsArr = new int[ArrayOfInt.length];

        for (int i = 0; i < ArrayOfInt.length; i++) {
            minimumsArr[i] = Arrays.stream(ArrayOfInt[i]).min().getAsInt();
        }
        System.out.println(Arrays.stream(minimumsArr).min().getAsInt());
    }
}