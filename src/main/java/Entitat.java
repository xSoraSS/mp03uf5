import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Entitat extends DefaultHandler {
    int idFilm, prioritat, any;
    String titol, situacio, cartell, original, direccio, interprets, sinopsi, versio, idioma, qualificacio, trailer, web, estrena;

    private boolean titolSemaphore, directorSemaphore, originalSemaphore, situacioSemaphore, cartellSemaphore, interpretsSemaphore, sinopsiSemaphore, versioSemaphore, idiomaSemaphore, qualificacioSemaphore, trailerSemaphore, webSemaphore, estrenaSemaphore;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if(qName.equalsIgnoreCase("film")){
        }else if(qName.equalsIgnoreCase("titol")){
            titolSemaphore = true;
        }else if(qName.equalsIgnoreCase("direccio")){
            directorSemaphore = true;
        }else if(qName.equalsIgnoreCase("original")){
            originalSemaphore = true;
        }
        else if(qName.equalsIgnoreCase("situacio")){
            situacioSemaphore = true;
        }else if(qName.equalsIgnoreCase("cartell")){
            cartellSemaphore = true;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if(titolSemaphore){
            this.titol =  new String(ch, start, length);
            titolSemaphore = false;
        }else if(directorSemaphore){
            this.direccio = new String(ch, start, length);
            directorSemaphore = false;
        }else if(originalSemaphore){
            this.original = new String(ch, start, length);
            originalSemaphore = false;
        }else if(situacioSemaphore){
            this.situacio = new String(ch, start, length);
            situacioSemaphore = false;
        }else if(cartellSemaphore){
            this.cartell = new String(ch, start, length);
            cartellSemaphore = false;
        }
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "titol " + titol + '\n' +
                "situacio " + situacio + '\n' +
                "cartell " + cartell + '\n' +
                "original " + original + '\n' +
                "direccio " + direccio;
    }
}