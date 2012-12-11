/**
 *
 */
package labo.isoroot.tkhs.batchTest1211;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author takahashi.y
 *
 */
public class Hoge {

    public static void main(String[] args) {

        System.out.println("in java!");

        for (String string : args) {
            System.out.println("引数：" + string);

        }

        try {
            Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:database.db");
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("select * from sample1");

            while(rs.next()) {
                System.out.println(rs.getInt(1));
                System.out.println(rs.getString(2));
            }

            con.close();


        } catch (SQLException e) {
            // TODO 自動生成された catch ブロック
            e.printStackTrace();
        } catch (ReflectiveOperationException e) {
            // TODO 自動生成された catch ブロック
            e.printStackTrace();
        }
    }

}
