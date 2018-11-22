package nmu.sau.fishbakh.k.k.labfour;

public class Main {

    public static void main(String[] args) {

        MatrixManager matrixManager = new MatrixManager();
        Matrix matrix = matrixManager.createList(50, 4, 4);
        matrixManager.displayArray(matrix);

        System.out.println("Authour :" + matrix.getAuthour());
        System.out.println("Sum of my array: " + matrixManager.sumOfList(matrix));

        System.out.println("Max of my array: " + matrixManager.findMaxOfList(matrix));

        System.out.println("Min of my array: " + matrixManager.findMinOfList(matrix));

    }

}
