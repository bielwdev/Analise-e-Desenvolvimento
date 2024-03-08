import java.util.HashSet;

public class HashSetOne {
    public static void main(String[] args) {

        HashSet<String> listaNome = new HashSet<>();
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
