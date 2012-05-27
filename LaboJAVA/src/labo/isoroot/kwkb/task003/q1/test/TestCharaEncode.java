/**
 *
 */
package labo.isoroot.kwkb.task003.q1.test;

import static org.junit.Assert.*;
import labo.isoroot.kwkb.task003.q1.CharaEncode;

import org.junit.Test;

/**
 *
 * @author DELL
 *
 */
public class TestCharaEncode {

	@Test
    public void testRead() {
        CharaEncode ce = new CharaEncode();
        ce.encode("C:/Users/DELL/git/study/LaboJAVA/data/utf8.txt", "C:/Users/DELL/git/study/LaboJAVA/data/shift-JIS.txt");
        assertEquals(1, 1);
    }

}
