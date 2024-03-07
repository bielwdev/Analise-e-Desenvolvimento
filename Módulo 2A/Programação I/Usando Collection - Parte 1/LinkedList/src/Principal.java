import java.util.LinkedList;

public class Principal {
    public static void main(String[] args) {

        LinkedList<String> listaNome = new LinkedList<>();
        listaNome.add("Oswaldo");
        listaNome.add("Gisele");
        listaNome.add("Giovanna");
        listaNome.add("Giulianna");
        listaNome.add(0, "Bielzin");

        System.out.println("Antes");
        for (String nome : listaNome) {
            System.out.println(nome);
        }

        listaNome.set(1, "Jujuba");
        System.out.println();
        System.out.println();
        System.out.println("Depois");

        for (String nome : listaNome) {
            System.out.println(nome);
        }
        System.out.println(listaNome.size());
    }
}