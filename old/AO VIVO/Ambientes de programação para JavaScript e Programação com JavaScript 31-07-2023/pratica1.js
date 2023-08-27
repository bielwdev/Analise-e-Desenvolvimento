// instalar na pasta do projeto : npm install readline-sync
const readline = require('readline-sync');

// Solicitar ao usuário que digite o nome
const name = readline.question('Digite seu nome: ');

// Solicitar ao usuário que digite o sobrenome
const sobrenome = readline.question('Digite seu sobrenome: ');

// Imprimir o nome completo no console
const nomeCompleto = `${name} ${sobrenome}`;
console.log('Nome Completo:', nomeCompleto);

/* const readline = require('readline'); */

//executar com (node pratica1.js) no TERMINAL