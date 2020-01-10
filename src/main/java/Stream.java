import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

public class Stream {
    static final String pathURL = "http://gencat.cat/llengua/cinema/provacin.xml";
    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {

        Scanner sc = new Scanner(System.in);
        URL url = new URL (pathURL);
        List<Entitat> entitats;

        SAXParserFactory parserFactory = SAXParserFactory.newInstance();
        SAXParser saxParser = parserFactory.newSAXParser();
        Entitat entitat = new Entitat();
        saxParser.parse(pathURL, entitat);
//        System.out.println("DALE AL 1");
//        int option = sc.nextInt();
//        switch (option){
//            case 1:
//                entitat.toString();
//                break;
//        }
    }
}
