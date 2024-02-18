public class Main {
    public static void main(String[] args) {


        AlunoEnsinoMedio alunoEnsinoMedio = new AlunoEnsinoMedio();
        AlunoEnsinoSuperior alunoEnsinoSuperior = new AlunoEnsinoSuperior();

        alunoEnsinoMedio.nome = "José";
        alunoEnsinoMedio.teste = 8;
        alunoEnsinoMedio.prova = 9;

        System.out.println("Aluno do Ensino Médio");
        System.out.println("Nome: " + alunoEnsinoMedio.nome);
        System.out.println("Média: " + alunoEnsinoMedio.getMedia());

        alunoEnsinoSuperior.nome = "Gabriel";
        alunoEnsinoSuperior.teste = 8;
        alunoEnsinoSuperior.prova = 9;

        System.out.println( );
        System.out.println("Aluno do Ensino Superior");
        System.out.println("Nome: " + alunoEnsinoSuperior.nome);
        System.out.println("Média: " + alunoEnsinoSuperior.getMedia());
    }
}