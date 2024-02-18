public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        aluno.setNome("Gabriel");
        aluno.setTeste(9);
        aluno.setProva(10);

        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Media aluno: " + aluno.getMedia());

        professor.setNome("Oswaldo");
        professor.setSalario(1000);
        System.out.println();
        System.out.println("Professor: " + professor.getNome());
        System.out.println("Salário: " + professor.getSalario());
        System.out.println("Desconto Inss: " + professor.getInss());
        System.out.println("Salário Líquido: " + professor.getSalarioLiquido());
    }
}