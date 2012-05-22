/**
 *
 */
package labo.isoroot.kwkb.task003.q1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author takahashi.y
 *
 */
public class CharaEncode {

    public void read(String filePath) {
        File file = new File(filePath);
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(file));
            String line;
            StringBuffer lines = new StringBuffer();

            // ファイル読み込み
            while ((line = br.readLine()) != null) {
                lines.append(line);
                lines.append(System.getProperty("line.separator"));
            }
            System.out.println(lines);
            String newLine = new String(lines.toString().getBytes("Shift-JIS"), "Shift-JIS");
            System.out.println(newLine);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
