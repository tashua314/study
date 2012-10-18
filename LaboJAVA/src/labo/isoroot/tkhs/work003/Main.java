package labo.isoroot.tkhs.work003;

import java.sql.SQLException;
import java.util.List;

public class Main {

    private String key;

    public Main() {
        this.key = "main";
    }

    public Main(String key) {
        this.key = key;
    }

    public int mainMethod() {

        Access access = new Access(key);

        try {
            List<String> data = access.getData();

            if (data.size() == 0) {
                return 0;
            } else if (data.size() == 1) {
                return 1;
            } else if (data.size() >= 2) {
                return 2;
            }

        } catch (SQLException e) {
            System.out.println("SQLEXceptionです。");
        }

        return 3;
    }

}
