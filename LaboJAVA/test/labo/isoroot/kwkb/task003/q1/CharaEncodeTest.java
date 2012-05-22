package labo.isoroot.kwkb.task003.q1;

import org.junit.Test;

public class CharaEncodeTest {

    @Test
    public void testRead() {
        CharaEncode ce = new CharaEncode();
        ce.read("C:/git/study/LaboJAVA/data/utf8.txt");
    }

}
