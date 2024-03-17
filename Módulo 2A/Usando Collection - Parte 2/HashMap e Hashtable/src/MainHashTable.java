import java.util.Hashtable;


public class MainHashTable {
    public static void main(String[] args) {

        Hashtable<Integer, String> linguagensProgramacao = new Hashtable<>();
        linguagensProgramacao.put(1, "C++");
        linguagensProgramacao.put(2, "Java");
        linguagensProgramacao.put(3, "Cobol");
        System.out.println("Conteúdo do Hashtable: " + linguagensProgramacao);
        System.out.println("");

        String valor = linguagensProgramacao.get(2);
        System.out.println("Elemento da chave 2: " + valor);
        System.out.println("Elemento da chave 3: " + linguagensProgramacao.get(3));
        System.out.println("");

        System.out.println("Chaves: " + linguagensProgramacao.keySet());
        System.out.println("Valiores: " + linguagensProgramacao.values());
        System.out.println("Chave/Valor: " + linguagensProgramacao.entrySet());

    }
}
