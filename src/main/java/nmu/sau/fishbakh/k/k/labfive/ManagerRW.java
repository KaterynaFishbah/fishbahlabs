package nmu.sau.fishbakh.k.k.labfive;

import com.google.gson.Gson;
import nmu.sau.fishbakh.k.k.labfour.Matrix;

import java.io.*;

public class ManagerRW {

    public Boolean writeMatrix(Matrix matrix, String fileName) {
        Gson gson = new Gson();
        try {
            Writer writer = new FileWriter(fileName);
            gson.toJson(matrix, writer);
            writer.flush();
            writer.close();
            return true;
        } catch (IOException e) {
            System.out.println("Here is an error with write :(");
            return false;
        }
    }

    public FileReader readMatrix(String fileName) {
        FileReader str = null;

        try {
            str = new FileReader(fileName);

        } catch (FileNotFoundException e) {
            System.out.println("Here is an error with read :(");
        }

        return str;
    }
}
