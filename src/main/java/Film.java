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

    public int getIdFilm() {
        return idFilm;
    }

    public int getPrioritat() {
        return prioritat;
    }

    public int getAny() {
        return any;
    }

    public String getTitol() {
        return titol;
    }

    public String getSituacio() {
        return situacio;
    }

    public String getCartell() {
        return cartell;
    }

    public String getOriginal() {
        return original;
    }

    public String getDireccio() {
        return direccio;
    }

    public String getInterprets() {
        return interprets;
    }

    public String getSinopsi() {
        return sinopsi;
    }

    public String getVersio() {
        return versio;
    }

    public String getIdioma() {
        return idioma;
    }

    public String getQualificacio() {
        return qualificacio;
    }

    public String getTrailer() {
        return trailer;
    }

    public String getWeb() {
        return web;
    }

    public String getEstrena() {
        return estrena;
    }

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