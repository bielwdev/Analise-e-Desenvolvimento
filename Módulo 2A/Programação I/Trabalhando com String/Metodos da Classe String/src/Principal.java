public class Principal {
    public static void main(String[] args) {

        String nome = "Gabriel";
        String nomeGuerra = "Gabriel";

        String sobrenome = new String("Gabriel");

        if(nome.equals(nomeGuerra))
            System.out.println("Nomes iguais");
        else
            System.out.println("Nomes diferentes");

        if (nome.equals(sobrenome))
            System.out.println("Nomes iguais");
        else
            System.out.println("Nomes diferentes");
    }
}
