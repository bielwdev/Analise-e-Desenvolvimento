public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();

        aluno.setNome("Gabriel");
        aluno.setTeste(9);
        aluno.setProva(10);

        System.out.println(aluno.getNome());
        System.out.println(aluno.getMedia());

    }
}