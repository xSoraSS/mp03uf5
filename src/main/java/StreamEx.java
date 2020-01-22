import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;
import java.util.stream.Collectors;

public class StreamEx {
    static final String pathURL = "http://gencat.cat/llengua/cinema/provacin.xml";
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException, JAXBException {
        String busqueda;
        StreamEx streamEx = new StreamEx();

        System.out.println("1. Contar cuantas peliculas hay.\n" +
                "2. Contar cuantas peliculas hay filtrando por año.\n" +
                "3. Mostrar peliculas que hay con la prioridad máxima.\n" +
                "4. Mostrar peliculas que hay con la prioridad mínima de X año.\n" +
                "5. Mostrar todos los titulos en mayúsculas.\n" +
                "6. Mostrar todas las peliculas ordenadas por titulo.\n" +
                "7. Mostrar todas las peliculas desde la que se encuentra en la 5a posición.");
        int option = sc.nextInt();
        streamEx.cargarPeliculas(option);
    }

    public void cargarPeliculas(int option) throws IOException, JAXBException {
        URL url = new URL (pathURL);
        List<Film> peliculas;
        long cont = 0;
        int año;
        EntitatsHandler entitatsHandler = new EntitatsHandler();
        peliculas = entitatsHandler.getListEntitats(url);
        switch (option) {
            case 1:
                cont = peliculas.stream().count();
                System.out.println(cont);
                break;
            case 2:
                System.out.println("Introduce el año.");
                año = sc.nextInt();
                cont = peliculas.stream().filter(s->s.getAny() == año).count();
                System.out.println(cont);
                break;
            case 3:
                Film max = peliculas.stream().max(Comparator.comparing(Film::getPrioritat)).get();
                System.out.println("Prioridad MAX: " + max.getPrioritat());
                break;
            case 4:
                System.out.println("Introduce el año.");
                año = sc.nextInt();
                Film min = peliculas.stream().filter(s->s.getAny() == año).min(Comparator.comparing(Film::getPrioritat)).get();
                System.out.println("Prioridad MIN: " + min.getPrioritat());
                break;
            case 5:
                List<String> collect = peliculas.stream().map(x -> x.getTitol().toUpperCase()).collect(Collectors.toList());
                System.out.println(collect);
                break;
            case 6:
                List<Film> sort = peliculas.stream().sorted(Comparator.comparing(Film::getTitol)).collect(Collectors.toList());
                sort.forEach(System.out::println);
                break;
            case 7:
                List<Film> distinct = peliculas.stream().skip(5).collect(Collectors.toList());
                System.out.println(distinct);
                break;
        }
    }
}
