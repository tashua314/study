/**
 * 
 */
package jp.isoroot.test;

import static org.junit.Assert.*;
import jp.isoroot.Run;
import jp.isoroot.Util;
import jp.isoroot.test.TestUtil;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author takahashi
 * 
 */
public class RunTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		if (TestUtil.createTest001File())
			System.out.println("test001file make OK.");
		else
			System.out.println("test001file make NG.");

	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		if (TestUtil.deleteTest001File())
			System.out.println("test001file delete OK.");
		else
			System.out.println("test001file delete NG.");
	}

	/**
	 * 読み出し、書き出しができるかどうか
	 * {@link jp.isoroot.Run#run()} のためのテスト・メソッド。
	 */
	@Test
	public final void testRun001() {
		Run run = new Run("test001.txt", "test001_out.txt");
		try {
			run.run();
			ArrayList<String> out = Util.readFileData("test001_out.txt");
			ArrayList<String> ans = Util.readFileData("test001_ans.txt");
			System.out.println("out:" + out);
			System.out.println("ans:" + ans);
			assertEquals(out, ans);
		} catch (FileNotFoundException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}
