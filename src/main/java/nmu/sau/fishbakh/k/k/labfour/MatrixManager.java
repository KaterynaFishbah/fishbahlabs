package nmu.sau.fishbakh.k.k.labfour;

import java.util.ArrayList;
import java.util.List;

public class MatrixManager {

    public Matrix createList(int randRange, int rowsCount, int colsCount) {
        int rand;
        Matrix matrix = new Matrix();
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> tmpList = new ArrayList<>();

        List<Integer> helperList;

        for (int i = 0; i < rowsCount; i++) {
            tmpList.clear();
            for (int j = 0; j < colsCount; j++) {
                rand = (int) (Math.random() * randRange - randRange / 2);
                tmpList.add(rand);
            }

            helperList = (ArrayList<Integer>) ((ArrayList<Integer>) tmpList).clone();
            list.add(helperList);
        }
        matrix.setList(list);

        return matrix;
    }

    public void displayArray(Matrix matrix) {

        System.out.println("My array:");

        for (List<Integer> anArr : matrix.getList()) {

            System.out.println(anArr.toString());
        }
    }

    public int sumOfList(Matrix matrix) {
        List<List<Integer>> list = matrix.getList();
        int sum = 0;
        for (int j = 0; j < list.size(); j++) {
            for (int i = 0; i < list.get(0).size(); i++) {
                sum += list.get(j).get(i);
            }
        }
        return sum;
    }

    public int findMaxOfList(Matrix matrix) {
        List<List<Integer>> list = matrix.getList();
        int maximum = list.get(0).get(0);
        for (int j = 0; j < list.size(); j++) {
            for (int i = 0; i < list.get(0).size(); i++) {
                if (list.get(j).get(i) > maximum) {
                    maximum = list.get(j).get(i);
                }
            }
        }
        return maximum;
    }

    public int findMinOfList(Matrix matrix) {
        List<List<Integer>> list = matrix.getList();
        int minimum = list.get(0).get(0);
        for (int j = 0; j < list.size(); j++) {
            for (int i = 0; i < list.get(0).size(); i++) {
                if (list.get(j).get(i) < minimum) {
                    minimum = list.get(j).get(i);
                }
            }
        }
        return minimum;
    }
}
