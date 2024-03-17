import java.util.HashMap;

public class MainHashMap {
    public MainHashMap() {
    }

    public static void main(String[] args) {
        HashMap<Integer, String> linguagensProgramacao = new HashMap();
        linguagensProgramacao.put(1, "C++");
        linguagensProgramacao.put(2, "Java");
        linguagensProgramacao.put(3, "Cobol");
        System.out.println("Conteúdo do HashMap: " + linguagensProgramacao);
        System.out.println("");
        String valor = (String)linguagensProgramacao.get(2);
        System.out.println("Elemento da chave 2: " + valor);
        System.out.println("Elemento da chave 3: " + (String)linguagensProgramacao.get(3));
        System.out.println("");
        System.out.println("Chaves: " + linguagensProgramacao.keySet());
        System.out.println("Valiores: " + linguagensProgramacao.values());
        System.out.println("Chave/Valor: " + linguagensProgramacao.entrySet());
    }
}
