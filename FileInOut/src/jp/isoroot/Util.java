package jp.isoroot;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Util {
	
	/**
	 * ファイルからデータを読込む
	 * 
	 * @param inFile
	 * @param list
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static ArrayList<String> readFileData(String inFile)
			throws FileNotFoundException, IOException {
		ArrayList<String> list = new ArrayList<String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(
				new FileInputStream(inFile)));
		String line = null;

		// ファイルデータセット
		while ((line = br.readLine()) != null) {
			list.add(line);
		}

		br.close();

		return list;
	}

	/**
	 * ファイル書き込み
	 * 
	 * @param outFile
	 * @param list
	 * @return
	 * @throws IOException
	 */
	public static boolean writeFile(String outFile, ArrayList<String> list)
			throws IOException {
		// ファイル書き込み
		File file = new File(outFile);
		PrintWriter pw = new PrintWriter(new BufferedWriter(
				new FileWriter(file)));
		for (int i = 0; i < list.size(); i++) {
			pw.println(list.get(i));
		}
		pw.close();

		return true;
	}
	

}
