package nmu.sau.fishbakh.k.k.labfive;

import com.google.gson.Gson;
import nmu.sau.fishbakh.k.k.labfour.Matrix;
import nmu.sau.fishbakh.k.k.labfour.MatrixManager;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        MatrixManager matrixManager = new MatrixManager();
        Matrix matrix = matrixManager.createList(50, 4, 4);
        ManagerRW managerRW = new ManagerRW();
        String fileName = "d:/kate.txt";
        Gson gson = new Gson();

        managerRW.writeMatrix(matrix, fileName);

        FileReader str = managerRW.readMatrix(fileName);

        System.out.println(str);

        Matrix mat = gson.fromJson(str, Matrix.class);

        matrixManager.displayArray(mat);

    }

}
