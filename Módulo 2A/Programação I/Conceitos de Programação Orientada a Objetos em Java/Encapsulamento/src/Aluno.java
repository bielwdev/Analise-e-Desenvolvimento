public class Aluno {
    String nome;
    double teste, prova;

    public java.lang.String getNome() {
        return nome;
    }

    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }

    public double getTeste() {
        return teste;
    }

    public void setTeste(double teste) {
        this.teste = teste;
    }

    public double getProva() {
        return prova;
    }

    public void setProva(double prova) {
        this.prova = prova;
    }

    double getMedia(){
        return(teste + prova)/2;
    }
}
