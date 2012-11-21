package labo.isoroot.tkhs.work003;

import java.sql.SQLException;
import java.util.List;

public class Main {

    private Access access;

    public Main() {
        this.access = new Access();
    }

    public Main(Access access) {
        this.access = access;
    }

    public int mainMethod() {

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
