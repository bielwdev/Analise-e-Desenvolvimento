// Forma de criar objetos
const pessoa = {
    nome: 'Gabriel',
    sobrenome: 'Victor'
}

console.log(pessoa['nome'])
console.log(pessoa['sobrenome'])

// 2 - Forma de criar objetos
const funcionario = new Object();
funcionario.nome = "Karen"
funcionario.sobrenome = "Joana"

console.log(funcionario.nome)

// 3 - Forma de criar objetos
function criarPessoa(nome,sobrenome){
    return {nome,sobrenome}
}

const p1 = criarPessoa("Arthur","Silva")

const p2 = criarPessoa("João","Silva")

console.log(p1.nome)
console.log(p2)

// 4 - Forma de criar objetos
function criarPessoa2(name,lastname, i){
    return{
        name,
        lastname,
        idade: i,
        nomeCompleto(){
            return `${this.name} ${this.lastname}`
        }
    }
}

const p3 = criarPessoa2("Pedro","Paulo",20)

const p4 = criarPessoa2("Thiago","Tulio",36)

console.log(p3.nomeCompleto())
console.log(p4.nomeCompleto())
