import java.util.ArrayList;

public class For {
    public static void main(String[] args) {

        ArrayList<String> listaNome = new ArrayList<>();

        listaNome.add("Oswaldo");

        listaNome.add("Gisele");

        listaNome.add("Giovanna");

        listaNome.add("Giulianna");

        for(String nome : listaNome) {
            System.out.println(nome);

        }
    }
}