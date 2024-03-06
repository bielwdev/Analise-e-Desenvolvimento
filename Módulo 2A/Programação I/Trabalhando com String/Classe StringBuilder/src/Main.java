public class Main {
    public static void main(String[] args) {

        String nome = "Gabriel";
        String sobreNome = "Victor";
        String nomeCompleto = nome + sobreNome;
        String nomeComBuffer;

        StringBuilder buffer = new StringBuilder();

        buffer.append(nome);
        buffer.append(sobreNome);

        nomeComBuffer = buffer.toString();

        System.out.println(nomeCompleto);
        System.out.println(nomeComBuffer);
        System.out.println("StringBuilder não é save threads");

    }
}