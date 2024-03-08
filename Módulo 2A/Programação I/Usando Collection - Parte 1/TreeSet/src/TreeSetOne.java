import java.util.TreeSet;

public class TreeSetOne {
    public static void main(String[] args) {

        TreeSet<String> listaNome = new TreeSet<>();
        listaNome.add("Oswaldo");
        listaNome.add("Gisele");
        listaNome.add("Giovanna");
        listaNome.add("Giulianna");
        listaNome.add("Oswaldo");

        for(String nome : listaNome){
            System.out.println(nome);
        }
    }
}
