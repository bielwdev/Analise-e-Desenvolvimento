import java.util.ArrayList;
import java.util.List;

public class ArrayListTwo {
    public static void main(String[] args) {

        ArrayList<String> listaNome = new ArrayList<>(); //ArrayList = interface (tendemos a programar para as interfaces)

        listaNome.add("Oswaldo");
        listaNome.add("Gisele");
        listaNome.add("Giovanna");
        listaNome.add("Giulianna");

        for (String nome: listaNome) {
            System.out.println(nome);
        }

        System.out.println();

        List<String> listaNome2 = new ArrayList<>(); //List = collection

        listaNome2.add("Oswaldo");
        listaNome2.add("Gisele");
        listaNome2.add("Giovanna");
        listaNome2.add("Giulianna");

        for (String nome2: listaNome2) {
            System.out.println(nome2);
        }

    }
}
