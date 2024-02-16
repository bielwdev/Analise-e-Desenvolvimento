import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nome = "Oswaldo";

        System.out.println("Professor: " + nome);

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o seu nome:");
        nome = teclado.nextLine();

        System.out.println("Aluno: " + nome);
    }
}