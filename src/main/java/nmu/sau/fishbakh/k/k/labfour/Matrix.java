package nmu.sau.fishbakh.k.k.labfour;

import java.util.List;
import java.util.Objects;

public class Matrix {
    private String authour = "Fishbahkh Kate";

    private List<List<Integer>> list;

    public List<List<Integer>> getList() {
        return list;
    }

    public void setList(List<List<Integer>> list) {
        this.list = list;
    }

    public String getAuthour() {
        return authour;
    }

    public void setAuthour(String authour) {
        this.authour = authour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matrix matrix = (Matrix) o;
        return Objects.equals(authour, matrix.authour) &&
                Objects.equals(list, matrix.list);
    }


}
