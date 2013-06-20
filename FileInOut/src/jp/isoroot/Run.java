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

/**
 * 読み込みファイルのデータをソート、重複削除を行い、書き込みファイルに出力する。
 * 
 * @author takahashi
 * 
 */
public class Run {

	// 読み込みファイル
	String inFile;
	// 書き込みファイル
	String outFile;
	// ロガー
	private static final Logger logger = LogManager.getLogger(Run.class
			.getName());

	/**
	 * コンストラクタ
	 * 
	 * @param inFile
	 *            読み込みファイル
	 * @param outFile
	 *            書き込みファイル
	 */
	public Run(String inFile, String outFile) {
		this.inFile = inFile;
		this.outFile = outFile;
	}

	/**
	 * 処理実行
	 * 
	 * @return 処理正常終了：true、処理異常終了：false
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public boolean run() throws FileNotFoundException, IOException {

		// ファイルデータ
		ArrayList<String> list = new ArrayList<String>();

		// データを読み込む
		list = Util.readFileData(this.inFile);

		logger.debug("読み込みファイルの行数：" + list.size());

		// データ加工を行う
		workData(list);

		logger.debug("書き込みファイルの行数：" + list.size());

		// ファイル書き込み
		Util.writeFile(outFile, list);

		return true;
	}

	/**
	 * データ処理
	 * 
	 * @param list
	 */
	private static void workData(ArrayList<String> list) {
		// 昇順ソート
		Collections.sort(list);

		// 重複項目削除
		removeOverlapItem(list);
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
				i--;
			} else {
			}
		}
		logger.debug("削除行数：" + removeCount);
	}
}
