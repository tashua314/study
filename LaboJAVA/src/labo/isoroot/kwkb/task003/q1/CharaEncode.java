/**
 * UTF-8で書かれたテキストファイルがあります。
 * そのファイルをShiftJIS 形式へ変換しコピーしなさい。
 * ※元となるUTF-8ファイルは添付を利用すること。
 */
package labo.isoroot.kwkb.task003.q1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * 文字コードを変換するクラス.
 */
public class CharaEncode {

    /** 文字コード：UTF-8. */
    private static final String CONST_UTF8 = "UTF-8";
    /** 文字コード：Shift-JIS. */
    private static final String CONST_SJIS = "Shift-JIS";
    /** 文字コード：iso-8859-1 (変更無しのbyte型の配列として取得) */
    // private static final String CONST_ISO = "iso-8859-1";
    /** 改行記号 */
    private static final String CONST_SEPARATOR = "line.separator";
    /** エンコード１によってファイル生成した時に付与するラベル */
    private static final String LABEL_ENC1 = "ENC1_";
    /** エンコード２によってファイル生成した時に付与するラベル */
    private static final String LABEL_ENC2 = "ENC2_";

    /**
     * 入力ファイルのテキストを文字コード変換をして、別ファイルを生成する。
     *
     * @param dirPath 入出力ファイルがあるディレクトリパス
     * @param fileName 入力ファイル名
     * @param copyFileName 出力ファイル名
     */
    public final void encode(String dirPath, String fileName,
            String copyFileName) {
        try {
            // できなかったエンコード
            encode1(dirPath + fileName, dirPath + LABEL_ENC1 + copyFileName);

            // できたエンコード
            encode2(dirPath + fileName, dirPath + LABEL_ENC2 + copyFileName);

        } catch (IOException e) {
            // TODO 自動生成された catch ブロック
            e.printStackTrace();
        }
    }

    /**
     * InputStreamReaderとOutputStreamWriterを用いたエンコード
     *
     * @param filePath 入力ファイルパス
     * @param copyFilePath 出力ファイルパス
     * @throws IOException ファイルが無かった場合
     */
    private void encode2(String filePath, String copyFilePath)
            throws IOException {

        InputStreamReader in;

        in = new InputStreamReader(new FileInputStream(new File(filePath)),
                CONST_UTF8);

        OutputStreamWriter out;
        out = new OutputStreamWriter(new FileOutputStream(
                new File(copyFilePath)), CONST_SJIS);

        int c;

        while ((c = in.read()) != -1) {
            out.write(c);
        }

        in.close();
        out.close();
    }

    /**
     * FileReaderとFileWriterを用いたエンコード
     *
     * @param filePath 入力ファイルパス
     * @param copyFilePath 出力ファイルパス
     * @throws IOException ファイルが無かった場合
     */
    private void encode1(String filePath, String copyFilePath)
            throws IOException {
        File file = new File(filePath);
        BufferedReader br = null;

        // デフォルトの文字コードは「UTF-8」らしい。
        // System.out.println(System.getProperty("file.encoding"));

        // FileReaderはデフォルトの文字コードを使うようなので、
        // このままでいけるはず。
        br = new BufferedReader(new FileReader(file));
        String line;
        StringBuffer lines = new StringBuffer();

        // ファイル読み込み
        while ((line = br.readLine()) != null) {
            lines.append(line);
            lines.append(System.getProperty(CONST_SEPARATOR));
        }

        // 外部ファイルから読み込む場合にこれでできるかと思ったが、できない
        String newLine = new String(lines.toString().getBytes(), CONST_SJIS);

        makeFile(copyFilePath, newLine);

        br.close();
    }

    /**
     * ファイルを作成する
     *
     * @param fileName 作成するファイル名
     * @param data 出力データ
     * @throws IOException ファイルが作成できなかった場合
     */
    private void makeFile(String fileName, String data) throws IOException {

        File file = new File(fileName);
        PrintWriter pw = new PrintWriter(new BufferedWriter(
                new FileWriter(file)));

        pw.print(data);

        pw.close();
    }
}
