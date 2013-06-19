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
import java.util.Collections;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main implements MainInterface {

	private static final Logger logger = LogManager.getLogger(Main.class
			.getName());

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
			// データを読み込む
			list = readFileData(inFile);
			
			logger.debug("読み込みファイルの行数：" + list.size());

			// データ加工を行う
			workData(list);

			logger.debug("書き込みファイルの行数：" + list.size());

			// ファイル書き込み
			writeFile(outFile, list);
			
		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}

	/**
	 * データ処理
	 * @param list
	 */
	private static void workData(ArrayList<String> list) {
		// 昇順ソート
		Collections.sort(list);

		// 重複項目削除
		removeOverlapItem(list);
	}

	/**
	 * ファイルからデータを読込む
	 * 
	 * @param inFile
	 * @param list
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	private static ArrayList<String> readFileData(String inFile)
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
	 * 重複項目を削除する
	 * 
	 * @param list
	 */
	private static void removeOverlapItem(ArrayList<String> list) {
		// 削除行数
		int removeCount = 0;
		// 重複項目を削除
		for (int i = 0; i + 1 < list.size(); i++) {
			if (list.get(i).equals(list.get(i + 1))) {
				list.remove(i);
				removeCount++;
			}
		}
		logger.debug("削除行数：" + removeCount);
	}

	/**
	 * コンソール確認用
	 * 
	 * @param list
	 */
	private static void sysoList(ArrayList<String> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	/**
	 * ファイル書き込み
	 * 
	 * @param outFile
	 * @param list
	 * @return
	 * @throws IOException
	 */
	private static PrintWriter writeFile(String outFile, ArrayList<String> list)
			throws IOException {
		// ファイル書き込み
		File file = new File(outFile);
		PrintWriter pw = new PrintWriter(new BufferedWriter(
				new FileWriter(file)));
		for (int i = 0; i < list.size(); i++) {
			pw.println(list.get(i));
		}
		pw.close();

		return pw;
	}

}
