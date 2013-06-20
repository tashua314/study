package jp.isoroot.test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import jp.isoroot.Util;

public class TestUtil {

	public static boolean createTest001File() throws IOException {
		ArrayList<String> list = new ArrayList<String>();
		list.add("test");
		list.add("test2");
		list.add("test3");
		if (Util.writeFile("test001.txt", list) && Util.writeFile("test001_ans.txt", list))
			return true;
		else
			return false;
	}

	public static boolean deleteTest001File() {
		if (Util.deleteFile("test001.txt")
				&& Util.deleteFile("test001_out.txt")
				&& Util.deleteFile("test001_ans.txt"))
			return true;
		else
			return false;
	}
}
