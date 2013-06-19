package jp.isoroot;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// 読み込みファイル
		String inFile = args[0];
		// 書き込みファイル
		String outFile = args[1];
		// ファイルデータ
		ArrayList<String> list = new ArrayList<String>();

		try {
			// ファイルデータセット
			BufferedReader br = new BufferedReader(new InputStreamReader(
					new FileInputStream(inFile)));
			String line = null;
			while ((line = br.readLine()) != null) {
				list.add(line);
			}

			// ファイル書き込み
			File file = new File(outFile);
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(
					file)));
			for (int i = 0; i < list.size(); i++) {
				pw.println(list.get(i));
			}
			br.close();
			pw.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
