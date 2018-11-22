package nmu.sau.fishbakh.k.k.labtwo;

public class Matrix {

    private int[][] arr;
    private int rowsCount;
    private int colsCount;
    private int randRange;

    public Matrix(int rowsCount, int colsCount, int randRange) {
        this.rowsCount = rowsCount;
        this.colsCount = colsCount;
        this.randRange = randRange;
    }

    public int getRowsCount() {
        return rowsCount;
    }

    public int getColsCount() {
        return colsCount;
    }

    public int[][] getArr() {
        return arr;
    }

    public int getRandRange() {
        return randRange;
    }

    public void setRowsCount(int rowsCount) {
        this.rowsCount = rowsCount;
    }

    public void setColsCount(int colsCount) {
        this.colsCount = colsCount;
    }

    public void setRandRange(int randRange) {
        this.randRange = randRange;
    }

    public void setArr(int[][] arr) {
        this.arr = arr;
    }
}
