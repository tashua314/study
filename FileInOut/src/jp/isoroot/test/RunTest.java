/**
 * 
 */
package jp.isoroot.test;

import static org.junit.Assert.*;
import jp.isoroot.Run;
import jp.isoroot.Util;
import jp.isoroot.test.TestUtil;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
	int i = 0;

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

		if (TestUtil.createTest002File())
			System.out.println("test002file make OK.");
		else
			System.out.println("test002file make NG.");

		if (TestUtil.createTest003File())
			System.out.println("test003file make OK.");
		else
			System.out.println("test003file make NG.");

		if (TestUtil.createTest004File())
			System.out.println("test004file make OK.");
		else
			System.out.println("test004file make NG.");

		if (TestUtil.createTest005File())
			System.out.println("test005file make OK.");
		else
			System.out.println("test005file make NG.");

		if (TestUtil.createTest006File())
			System.out.println("test006file make OK.");
		else
			System.out.println("test006file make NG.");

		if (TestUtil.createTest007File())
			System.out.println("test007file make OK.");
		else
			System.out.println("test007file make NG.");

		if (TestUtil.createTest008File())
			System.out.println("test008file make OK.");
		else
			System.out.println("test008file make NG.");

	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		if (TestUtil.deleteTestFile())
			System.out.println("testfile delete OK.");
		else
			System.out.println("testfile delete NG.");
	}

	/**
	 * 読み出し、書き出しができるかどうか 。 <br>
	 * {@link jp.isoroot.Run#run()} のためのテスト・メソッド。
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	@Test
	public final void testRun001() throws FileNotFoundException, IOException {
		String testNum = "001";
		testLogic(testNum);
	}

	/**
	 * ソートができるかどうか(英数記号込み)。 <br>
	 * {@link jp.isoroot.Run#run()} のためのテスト・メソッド。
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	@Test
	public final void testRun002() throws FileNotFoundException, IOException {
		String testNum = "002";
		testLogic(testNum);
	}

	/**
	 * 正しく削除されるか(同一データは２つ存在)。 <br>
	 * {@link jp.isoroot.Run#run()} のためのテスト・メソッド。
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	@Test
	public final void testRun003() throws FileNotFoundException, IOException {
		String testNum = "003";
		testLogic(testNum);
	}

	/**
	 * 正しく削除されるか(同一データは3つ以上存在)。 <br>
	 * {@link jp.isoroot.Run#run()} のためのテスト・メソッド。
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	@Test
	public final void testRun004() throws FileNotFoundException, IOException {
		String testNum = "004";
		testLogic(testNum);
	}

	/**
	 * 削除されて一つだけ残る(全て同一) <br>
	 * {@link jp.isoroot.Run#run()} のためのテスト・メソッド。
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	@Test
	public final void testRun005() throws FileNotFoundException, IOException {
		String testNum = "005";
		testLogic(testNum);
	}

	/**
	 * 読み込みファイルが存在しない <br>
	 * {@link jp.isoroot.Run#run()} のためのテスト・メソッド。
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	@Test(expected = FileNotFoundException.class)
	public final void testRun006() throws FileNotFoundException, IOException {
		String testNum = "006";
		testLogic(testNum);
	}

	/**
	 * 書き出しファイルがロックされている <br>
	 * {@link jp.isoroot.Run#run()} のためのテスト・メソッド。
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	@Test
	public final void testRun007() throws FileNotFoundException, IOException {
		// TODO まだできていない。どうやってやるか調査
		// ファイルを開く
		File file = new File("test007_out.txt");
		file.createNewFile();
		BufferedReader br = new BufferedReader(new InputStreamReader(
				new FileInputStream(file)));
		String testNum = "007";
		testLogic(testNum);
	}

	/**
	 * 読み込みファイルが空 <br>
	 * {@link jp.isoroot.Run#run()} のためのテスト・メソッド。
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	@Test
	public final void testRun008() throws FileNotFoundException, IOException {
		String testNum = "008";
		testLogic(testNum);
	}

	/**
	 * テストの主要ロジック
	 * 
	 * @param testNum
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	private void testLogic(String testNum) throws FileNotFoundException, IOException {
		StringBuffer sb = new StringBuffer("test");
		sb.append(testNum);

		Run run = new Run(sb.toString() + ".txt", sb.toString() + "_out.txt");
		// 実行
		run.run();

		ArrayList<String> out = Util.readFileData(sb.toString() + "_out.txt");
		ArrayList<String> ans = Util.readFileData(sb.toString() + "_ans.txt");
		System.out.println("out:" + out);
		System.out.println("ans:" + ans);

		assertEquals(out, ans);

	}
}
