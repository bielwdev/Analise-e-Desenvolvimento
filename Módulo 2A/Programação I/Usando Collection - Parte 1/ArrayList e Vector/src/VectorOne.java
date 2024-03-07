import java.util.Vector;

public class VectorOne {
    public static void main(String[] args) {

        Vector<String> listaNome = new Vector<>();
        listaNome.add("Oswaldo");
        listaNome.add("Gisele");
        listaNome.add ("Giovanna");
        listaNome.add("Giulianna");

        for(String nome: listaNome) {
            System.out.println(nome);
        }

    }
}
