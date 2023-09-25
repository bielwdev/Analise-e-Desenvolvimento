const pessoa = {
    nome: "Gabriel",
    idade: 22,
    profissão: "Desenvolvedor"
}

const pessoajson = JSON.stringify(pessoa)
console.log(pessoa)
console.log(pessoajson)

const pessoaObj = JSON.parse(pessoajson)
console.log(pessoaObj)