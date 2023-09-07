class Funcionario {
    constructor(nome, idade, cargo) {
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
    }

    seApresentar() {
        return `Olá! Sou o ${this.nome}, tenho ${this.idade} anos e meu cargo é ${this.cargo}`;
    }

    trabalhar() {
        return `O funcionário ${this.nome} está trabalhando como ${this.cargo}`;
    }
}

class Gerente extends Funcionario {
    constructor(nome, idade, departamento) {
        super(nome, idade, "Gerente");
        this.departamento = departamento;
    }

    gerenciar() {
        return `Olá! Sou o Gerente ${this.nome}, tenho ${this.idade} anos e gerencio o departamento ${this.departamento}`;
    }
}

class Desenvolvedor extends Funcionario {
    constructor(nome, idade, linguagem) {
        super(nome, idade, "Desenvolvedor");
        this.linguagem = linguagem;
    }

    programar() {
        return `Olá! Sou o Desenvolvedor ${this.nome} e programo nas seguintes linguagens: ${this.linguagem}`;
    }
}

function exibirErro(mensagem) {
    const outputDiv = document.getElementById("output");
    outputDiv.innerHTML = `<p style="color: red;">Erro: ${mensagem}</p>`;
}

const form = document.getElementById("employeeForm");

form.addEventListener("submit", function (event) {
    event.preventDefault();

    const nome = document.getElementById("name").value;
    const idade = parseFloat(document.getElementById("age").value);
    const cargo = document.getElementById("jobrole").value;
    const departamento = document.getElementById("departament").value;
    const linguagem = document.getElementById("language").value;

    try {
        if (!nome || !idade || !cargo) {
            throw new Error("Preencha todos os campos obrigatórios (Nome, Idade e Cargo).");
        }

        let funcionario;

        if (cargo === "Gerente") {
            if (!departamento) {
                throw new Error("Informe o departamento para o Gerente.");
            }
            funcionario = new Gerente(nome, idade, departamento);
        } else if (cargo === "Desenvolvedor") {
            if (!linguagem) {
                throw new Error("Informe as linguagens de programação para o Desenvolvedor.");
            }
            funcionario = new Desenvolvedor(nome, idade, linguagem);
        } else {
            throw new Error("Cargo inválido.");
        }

        const outputDiv = document.getElementById("output");
        outputDiv.innerHTML = `<p>${funcionario.seApresentar()}</p>`;
        outputDiv.innerHTML += `<p>${funcionario.trabalhar()}</p>`;

        if (funcionario instanceof Gerente) {
            outputDiv.innerHTML += `<p>${funcionario.gerenciar()}</p>`;
        } else if (funcionario instanceof Desenvolvedor) {
            outputDiv.innerHTML += `<p>${funcionario.programar()}</p>`;
        }
    } catch (error) {
        exibirErro(error.message);
    }
});
