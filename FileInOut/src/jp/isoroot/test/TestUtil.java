package jp.isoroot.test;

import java.io.IOException;
import java.util.ArrayList;

import jp.isoroot.Util;

public class TestUtil {

	/**
	 * test001: 読み出し、書き出しができるかどうか
	 * 
	 * @return
	 * @throws IOException
	 */
	public static boolean createTest001File() throws IOException {
		ArrayList<String> list = new ArrayList<String>();
		list.add("test1");
		list.add("test2");
		list.add("test3");
		if (Util.writeFile("test001.txt", list)
				&& Util.writeFile("test001_ans.txt", list))
			return true;
		else
			return false;
	}

	/**
	 * test002: ソートができるかどうか(英数記号込み)
	 * 
	 * @return
	 * @throws IOException
	 */
	public static boolean createTest002File() throws IOException {
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> listAns = new ArrayList<String>();
		list.add("test");
		list.add("/][");
		list.add("test3");
		list.add("123");
		list.add("003");
		list.add("");
		list.add("aaa");
		list.add(";.");
		// ---
		listAns.add("");
		listAns.add("/][");
		listAns.add("003");
		listAns.add("123");
		listAns.add(";.");
		listAns.add("aaa");
		listAns.add("test");
		listAns.add("test3");
		if (Util.writeFile("test002.txt", list)
				&& Util.writeFile("test002_ans.txt", listAns))
			return true;
		else
			return false;
	}

	/**
	 * test003: 正しく削除されるか(同一データは２つ存在)。
	 * 
	 * @return
	 * @throws IOException
	 */
	public static boolean createTest003File() throws IOException {
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> listAns = new ArrayList<String>();
		list.add("test");
		list.add("test");
		list.add("123");
		list.add("123");
		list.add("");
		list.add("");
		list.add("aaa");
		list.add("aaa");
		// ---
		listAns.add("");
		listAns.add("123");
		listAns.add("aaa");
		listAns.add("test");
		if (Util.writeFile("test003.txt", list)
				&& Util.writeFile("test003_ans.txt", listAns))
			return true;
		else
			return false;
	}

	/**
	 * test004: 正しく削除されるか(同一データは3つ以上存在)。
	 * 
	 * @return
	 * @throws IOException
	 */
	public static boolean createTest004File() throws IOException {
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> listAns = new ArrayList<String>();
		list.add("test");
		list.add("002");
		list.add("test");
		list.add("test");
		list.add("");
		list.add("test");
		list.add("test");
		list.add("test");
		list.add("");
		list.add("");
		list.add("002");
		list.add("");
		list.add("");
		list.add("");
		list.add("");
		list.add("");
		list.add("002");
		list.add("002");
		list.add("test");
		list.add("002");
		// ---
		listAns.add("");
		listAns.add("002");
		listAns.add("test");
		if (Util.writeFile("test004.txt", list)
				&& Util.writeFile("test004_ans.txt", listAns))
			return true;
		else
			return false;
	}

	/**
	 * test005: 削除されて一つだけ残る(全て同一)
	 * 
	 * @return
	 * @throws IOException
	 */
	public static boolean createTest005File() throws IOException {
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> listAns = new ArrayList<String>();
		list.add("002");
		list.add("002");
		list.add("002");
		list.add("002");
		list.add("002");
		list.add("002");
		list.add("002");
		// ---
		listAns.add("002");
		if (Util.writeFile("test005.txt", list)
				&& Util.writeFile("test005_ans.txt", listAns))
			return true;
		else
			return false;
	}

	/**
	 * test006: 読み込みファイルが存在しない
	 * 
	 * @return
	 * @throws IOException
	 */
	public static boolean createTest006File() throws IOException {
		return true;
	}

	/**
	 * test007: 書き出しファイルがロックされている
	 * 
	 * @return
	 * @throws IOException
	 */
	public static boolean createTest007File() throws IOException {
		ArrayList<String> list = new ArrayList<String>();
		list.add("002");
		list.add("test");
		// ---
		if (Util.writeFile("test007.txt", list) && Util.writeFile("test007_ans.txt", list))
			return true;
		else
			return false;
	}

	/**
	 * test008: 読み込みファイルが空
	 * 
	 * @return
	 * @throws IOException
	 */
	public static boolean createTest008File() throws IOException {
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> listAns = new ArrayList<String>();
		if (Util.writeFile("test008.txt", list)
				&& Util.writeFile("test008_ans.txt", listAns))
			return true;
		else
			return false;
	}

	/**
	 * テスト用ファイルを削除する
	 * 
	 * @return
	 */
	public static boolean deleteTestFile() {
		if (Util.deleteFile("test001.txt")
				&& Util.deleteFile("test001_ans.txt")
				&& Util.deleteFile("test001_out.txt")
				&& Util.deleteFile("test002.txt")
				&& Util.deleteFile("test002_ans.txt")
				&& Util.deleteFile("test002_out.txt")
				&& Util.deleteFile("test003.txt")
				&& Util.deleteFile("test003_ans.txt")
				&& Util.deleteFile("test003_out.txt")
				&& Util.deleteFile("test004.txt")
				&& Util.deleteFile("test004_ans.txt")
				&& Util.deleteFile("test004_out.txt")
				&& Util.deleteFile("test005.txt")
				&& Util.deleteFile("test005_ans.txt")
				&& Util.deleteFile("test005_out.txt")
				&& Util.deleteFile("test006.txt")
				&& Util.deleteFile("test006_ans.txt")
				&& Util.deleteFile("test006_out.txt")
				&& Util.deleteFile("test007.txt")
				&& Util.deleteFile("test007_ans.txt")
				&& Util.deleteFile("test007_out.txt")
				&& Util.deleteFile("test008.txt")
				&& Util.deleteFile("test008_ans.txt")
				&& Util.deleteFile("test008_out.txt"))
			return true;
		else
			return false;
	}
}
