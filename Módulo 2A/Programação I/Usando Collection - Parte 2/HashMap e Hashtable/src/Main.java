import java.util.HashMap;
import java.util.Map;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Map<String, Integer> funcSal = new HashMap(10);
        funcSal.put("Rita", 10000);
        funcSal.put("Samuel", 20000);
        funcSal.put("Maria", 30000);
        funcSal.put("Raquel", 10000);
        funcSal.put("Nicolas", null);
        System.out.println("Original Map: " + funcSal);
        funcSal.put("Renato", 23000);
        funcSal.remove("Nicolas");
        System.out.println("Updated Map: " + funcSal);
        System.out.println(funcSal.keySet());
        System.out.println(funcSal.values());
    }
}
