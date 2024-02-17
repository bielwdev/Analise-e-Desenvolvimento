import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String matricula, nome, situacao, turma;
        double teste, prova, media;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a turma: ");
        turma = teclado.next();

        for (int i=0;i<3;i++){
            System.out.println("Digite a matricula: ");
            matricula = teclado.next();

            teclado.nextLine();
            System.out.println("Digite o nome do aluno: ");
            nome = teclado.nextLine();

            System.out.println("Digite a nota do teste: ");
            teste = teclado.nextDouble();

            System.out.println("Digite a nota da prova: ");
            prova = teclado.nextDouble();

            media = (teste + prova)/2;

            System.out.println("Matricula: " + matricula);
            System.out.println("Nome: " + nome);
            System.out.println("Média: " + media);

        }

    }
}