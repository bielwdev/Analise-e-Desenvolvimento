import java.util. LinkedHashMap;

public class Principal {
    public static void main(String[] args) {

        LinkedHashMap<String, String> listaNomes = new LinkedHashMap<>();
        listaNomes.put("vava", "Oswaldo");
        listaNomes.put("gisa", "Gisele");
        listaNomes.put("gigi", "Giovanna");

        listaNomes.put("giugiu", "Giulianna");
        System.out.println("LinkedHashMap: " + listaNomes);

// Creating a LinkedHashMap from other LinkedHashMap
        LinkedHashMap<String, String> novalistaNomes = new LinkedHashMap<>(listaNomes);
        novalistaNomes.put("Jubis", "Jujuba");
        System.out.println("Nova LinkedHashMap: " + novalistaNomes);

    }
}
