import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

public class Stream {
    static final String pathURL = "http://gencat.cat/llengua/cinema/provacin.xml";
    public static void main(String[] args) throws IOException, JAXBException {
        Scanner sc = new Scanner(System.in);
        URL url = new URL (pathURL);
        List<Film> peliculas;

        EntitatsHandler entitatsHandler = new EntitatsHandler();
        peliculas = entitatsHandler.getListEntitats(url);
        for (Film f:peliculas) {
            System.out.println(f);
        }

//        System.out.println("DALE AL 1");
//        int option = sc.nextInt();
//        switch (option){
//            case 1:
//                entitat.toString();
//                break;
//        }
    }
}
