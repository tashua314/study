package labo.isoroot.tkhs.work003;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Test;

public class MainTest {

    /**
     * MockItoの使いっぷり確認
     */
    @Test
    public void test() {

        Access access = spy(new Access());
        Main main = spy(new Main(access));

        ArrayList<String> mock = new ArrayList<String>();
        mock.add("mock");

        try {
            when(access.getData()).thenReturn(mock);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        assertEquals(1, main.mainMethod());

    }

}
