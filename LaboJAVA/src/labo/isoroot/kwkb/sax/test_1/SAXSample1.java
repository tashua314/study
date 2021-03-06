/**
 *
 */
package labo.isoroot.kwkb.sax.test_1;

import java.io.IOException;

import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

/**
 * @author takahashi.y
 *
 */
class SAXSample1 {

    /** SAXのパーサーのURL */
    protected static final String PARSER_NAME = "org.apache.xerces.parsers.SAXParser";

    /**
     * メインメソッド
     * @param args 引数
     */
    public static void main(String[] args) {

        String fileName = args[0];

        try {
            XMLReader parser = XMLReaderFactory.createXMLReader(PARSER_NAME);

            SimpleSAXHandler sh = new SimpleSAXHandler();
            parser.setContentHandler(sh);

            parser.parse(fileName);

        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
