import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "dataroot")
class Films{
    @XmlElement (name = "FILM")
    List<Film> films ;
}

public class Film {

    @XmlElement (name = "IDFILM")
    int idFilm;

    @XmlElement (name = "PRIORITAT")
    int prioritat;

    @XmlElement (name = "ANY")
    int any;

    @XmlElement (name = "TITOL")
    String titol;

    @XmlElement (name = "SITUACIO")
    String situacio;

    @XmlElement (name = "CARTELL")
    String cartell;

    @XmlElement (name = "ORIGINAL")
    String original;

    @XmlElement (name = "DIRECCIO")
    String direccio ;

    @XmlElement (name = "INTERPRETS")
    String interprets;

    @XmlElement (name = "SINOPSI")
    String sinopsi;

    @XmlElement (name = "VERSIO")
    String versio;

    @XmlElement (name = "IDIOMA_x0020_ORIGINAL")
    String idioma;

    @XmlElement (name = "QUALIFICACIO")
    String qualificacio;

    @XmlElement (name = "TRAILER")
    String trailer;

    @XmlElement (name = "WEB")
    String web;

    @XmlElement (name = "ESTRENA")
    String estrena;

    @Override
    public String toString() {
        return "Film{" +
                "idFilm=" + idFilm +
                ", prioritat=" + prioritat +
                ", any=" + any +
                ", titol='" + titol + '\'' +
                ", situacio='" + situacio + '\'' +
                ", cartell='" + cartell + '\'' +
                ", original='" + original + '\'' +
                ", direccio='" + direccio + '\'' +
                ", interprets='" + interprets + '\'' +
                ", sinopsi='" + sinopsi + '\'' +
                ", versio='" + versio + '\'' +
                ", idioma='" + idioma + '\'' +
                ", qualificacio='" + qualificacio + '\'' +
                ", trailer='" + trailer + '\'' +
                ", web='" + web + '\'' +
                ", estrena='" + estrena + '\'' +
                '}' + '\'';
    }
}