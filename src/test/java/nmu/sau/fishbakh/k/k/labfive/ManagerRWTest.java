package nmu.sau.fishbakh.k.k.labfive;
import nmu.sau.fishbakh.k.k.labfour.Matrix;
import nmu.sau.fishbakh.k.k.labfour.MatrixManager;

import org.junit.Test;
import com.google.gson.Gson;

import java.io.FileReader;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class ManagerRWTest {
    private static MatrixManager matrixManager = new MatrixManager();
    private static Matrix matrix = matrixManager.createList(50, 4, 4);
    private static ManagerRW managerRW = new ManagerRW();
    private static Gson gson = new Gson();
    static final String fileName = "d:/kate.txt";
    @Test
    public void writeMatrix() {
        Boolean a = managerRW.writeMatrix(matrix, fileName);
        assertTrue("Test write matrix",a);
    }

    @Test
    public void readMatrix() {
        managerRW.writeMatrix(matrix, fileName);
        FileReader str = managerRW.readMatrix(fileName);
        Matrix mat = gson.fromJson(str, Matrix.class);

        assertEquals("Test read matrix",mat,matrix);
    }
}