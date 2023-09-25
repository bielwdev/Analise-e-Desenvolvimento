class Funcionario{

    constructor(nome,idade,cargo){
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
    }
    
    seApresentar(){
        alert("Olá! Sou o " + this.nome + ", tenho " + this.idade + " anos " + "e o meu cargo é " + this.cargo);
    }

    trabalhar(){
        alert("O funcionário " + this.nome + " está trabalhando como " + this.cargo);
    }
}

class Gerente extends Funcionario{

    constructor(nome,idade,departamento){
        super(nome, idade);
        this.departamento = departamento;
    }

    gerenciar(){
        alert("Olá! Sou o Gerente " + this.nome + ", tenho " + this.idade + " anos " + "e gerencio o departamento " + this.departamento)
    }
}

class Desenvolvedor extends Funcionario{

    constructor(nome,idade,linguagem){
        super(nome,idade);
        this.linguagem = linguagem;
    }
    programar(){
        alert("Olá! Sou o Desenvolvedor " + this.nome + " e programo nas seguintes linguagens: " + this.linguagem)
    }
}

var nome = prompt("Digite o seu nome")
var idade = parseFloat(prompt("Digite sua idade"))
var cargo = prompt("Digite seu cargo")

let fun1 = new Funcionario(nome,idade,cargo);
fun1.seApresentar();
fun1.trabalhar();

var nome = prompt("Digite o seu nome")
var idade = parseFloat(prompt("Digite sua idade"))
var departamento = prompt("Digite qual o seu departamento")

let fun2 = new Gerente(nome,idade,departamento);
fun2.gerenciar();

var nome = prompt("Digite o seu nome")
var idade = parseFloat(prompt("Digite sua idade"))
let linguagem = prompt("Digite suas stacks")

let fun3 = new Desenvolvedor(nome,idade,linguagem)
fun3.programar();