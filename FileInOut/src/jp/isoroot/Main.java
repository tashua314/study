package jp.isoroot;

import java.io.FileNotFoundException;
import java.io.IOException;

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
		// 実行結果
		boolean result = false;
		// 実行クラスインスタンス
		Run run = new Run(inFile, outFile);
		// 処理計測開始
		long start = System.currentTimeMillis();

		try {
			// 処理実行(成功時にtrue)
			result = run.run();
		} catch (FileNotFoundException e) {
			logger.error("ファイルが見つかりません。");
		} catch (IOException e) {
			logger.error("入出力エラーです。¥n" + e.getMessage());
		}

		long end = System.currentTimeMillis();
		logger.debug("実行時間：" + (end - start) + "msec");
		if (result) logger.info("処理成功");
		else logger.info("処理失敗");

	}
}
