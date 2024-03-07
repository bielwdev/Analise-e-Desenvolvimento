import java.util.ArrayList;

public class ArrayListThree {
    public static void main(String[] args) {

        ArrayList<String> listaNome = new ArrayList<>();
        listaNome.add("Oswaldo");
        listaNome.add("Gisele");
        listaNome.add("Giovanna");
        listaNome.add("Giulianna");

        for (String nome: listaNome){
            System.out.println(nome);
        }

        System.out.println("Antes");
        if (listaNome.contains("Oswaldo")){
            System.out.println("Contem Oswaldo");
        }else{
            System.out.println("Não contem Oswaldo");
        }

        listaNome.remove(0);
        System.out.println();
        System.out.println();

        System.out.println("Depois");
        for (String nome: listaNome){
            System.out.println(nome);
        }
        if (listaNome.contains("Oswaldo")){
            System.out.println("Contem Oswaldo");
        }else{
            System.out.println("Não contem Oswaldo");
        }
    }
}