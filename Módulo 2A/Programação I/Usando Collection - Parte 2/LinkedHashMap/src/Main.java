import java.util. LinkedHashMap; 
import java.util. Map;
public class Main { 
    public static void main (String args[]) {
        //Aqui o pedido de insergdo mantém
        Map<Integer, String> Imap = new LinkedHashMap<Integer, String>();
        Imap.put(12, "Maria");
        Imap.put(5, "Nicole");
        Imap.put(23, "Samuel");
        Imap.put(9, "Sonia");
        System.out.println("LinkedHashMap antes da modificação" + Imap);
        System.out.println("funcionário ID 12 exists: " + Imap.containsKey(12));
        System.out.println("funcionário André Exists: " + Imap.containsValue("Andre"));
        System.out.println("Número total de funcionários: " + Imap.size());
        System.out.println("Removendo funcionário com ID 5: " + Imap.remove(5));
        System.out.println("Removendo funciondrio com ID 3 (o qual não existe): " + Imap.remove(3));
        System.out.println("LinkedHashMap depois da modificação" + Imap);

    }
    } 