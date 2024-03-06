import discentes.Aluno;
import discentes.AlunoSuperior;

public class Main {
    public static void main(String[] args) {
        AlunoSuperior aluno = new AlunoSuperior();

        //aluno.nome = "Gabriel";
        aluno.setNome("Gabriel");

        //aluno.teste = 9;
        aluno.setTeste(9);
        //aluno.prova = 10;
        aluno.setProva(10);

        System.out.print(aluno.getMedia());
    }
}

