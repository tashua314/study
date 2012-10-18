package labo.isoroot.tkhs.work003;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Access {

    private String key;

    public Access(String key) {
        this.key = key;
    }

    public Access() {
        this.key = "test";
    }

    public List<String> getData() throws SQLException {
        List<String> list = new ArrayList<String>();

        list.add(key);
        list.add(key + "2");

        return list;
    }

}
