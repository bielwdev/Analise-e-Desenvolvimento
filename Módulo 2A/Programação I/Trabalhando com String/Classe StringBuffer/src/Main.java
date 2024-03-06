public class Main {
    public static void main(String[] args) {

        String nome = "Gabriel";
        String sobreNome = "Victor";
        String nomeCompleto = nome + sobreNome;
        String nomeComBuffer;

        System.out.println(nome + " " + sobreNome); //esforço maior de processamento

        StringBuffer buffer = new StringBuffer();

        buffer.append(nome);
        buffer.append(sobreNome);

        nomeComBuffer = buffer.toString();

        System.out.println(nomeCompleto);
        System.out.println(nomeComBuffer);
    }
}