// os operadores são: aritiméticos, string, lógicos e de atribuição.

// Aritiméticos: ligam dois objetos e processam para ter um resultado. (operadores aritméticos realizam operações matemáticas como adição, subtração, multiplicação e divisão.)
// String: Só podem ser usados com strings (textos). O +operador junta duas strings. Ao contrário, o +=operador é usado para anexar uma string a uma existente.
// Lógicos: São usados para formular condições. Uma condição sempre consiste m dois lados que se baseiam na igualdade ou na desigualdade, podem ser true ou false.
// Atribuição: São usados para indicar valores. (operadores de atribuição são utilizados para definir valores a variáveis.)

var n = 3;
//n = n * 10;
n *= 10
console.log(n);

var x = 10;
x--

a = 10;
b = 20;
c = 60;

console.log(x);

console.log(!(n <= x || b !=  c));

// verificar se a é maior que b e b é divisivel por 2
console.log(a > b && b % 2 == 0);

// verificar se b é maior igual a ou b dividido por 2 o resultado é 2
console.log(b <= a || b / 2 == 2);


// verificar se a é maior que b e maior igual a 5
console.log(a > b && 5 <=b);


// verificar se b é par ou impar usando ternario
resultado = b % 2 == 0 ? "Par" : "Impar";