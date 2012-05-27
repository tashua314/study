/**
 * UTF-8で書かれたテキストファイルがあります。
 * そのファイルをShiftJIS 形式へ変換しコピーしなさい。
 * ※元となるUTF-8ファイルは添付を利用すること。
 */
package labo.isoroot.kwkb.task003.q1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.sound.sampled.AudioFormat.Encoding;

/**
 * @author takahashi.y
 *
 */
public class CharaEncode {

	public void encode(String filePath, String copyFilePath) {
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

			String newLine = new String(lines.toString().getBytes("UTF8"),
					"Shift-JIS");

			makeFile(copyFilePath, newLine);

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

	private void makeFile(String file_name, String data) throws IOException {

		File file = new File(file_name);
		PrintWriter pw = new PrintWriter(new BufferedWriter(
				new FileWriter(file)));

		pw.print(data);

		pw.close();
	}
}
