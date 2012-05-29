/**
 * 課題003に関するテスト
 */
package labo.isoroot.kwkb.task003.q1.test;

import static org.junit.Assert.assertEquals;
import labo.isoroot.kwkb.task003.q1.CharaEncode;

import org.junit.Test;

/**
 * CharaEncodeクラスのテスト
 */
public class TestCharaEncode {

    @Test
    public void testRead() {
        CharaEncode ce = new CharaEncode();
        ce.encode("./data/", "utf8.txt", "shift-JIS.txt");
        assertEquals(1, 1);
    }

}
