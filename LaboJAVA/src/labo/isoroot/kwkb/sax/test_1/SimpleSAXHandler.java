package labo.isoroot.kwkb.sax.test_1;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SimpleSAXHandler extends DefaultHandler {

    public void startDocument() throws SAXException {

        System.out.println("Documentの開始です。");

    }

    public void endDocument() throws SAXException {

        System.out.println("Documentの終了です。");

    }

    public void startElement(String uri, String name, String qualifiedName,
            Attributes attributes) {
        System.out.println("要素名 " + name + " の開始です。");

        /*
         * attributes.getLength()でAttributesに含まれる属性の数を得ます
         */
        int length = attributes.getLength();
        if (length == 0) {
            return;
        }

        /*
         * 属性の数だけ、属性名と属性値を取得、表示します
         */
        for (int i = 0; i < length; i++) {
            System.out.println(attributes.getQName(i) + " = " + attributes.getValue(i));
        }
    }

    public void endElement(String uri, String name, String qualifiedName) {
        System.out.println("要素名 " + name + " の終了です。");
    }

    /*
     * 要素の内容を取得します
     */

    public void characters(char[] ch, int start, int length) {

        System.out.println(new String(ch, start, length));

    }
}