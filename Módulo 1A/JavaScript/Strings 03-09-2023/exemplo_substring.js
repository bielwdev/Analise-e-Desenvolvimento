var s = "JavaScript e Python";

var pos1 = s.indexOf("Python");
console.log(pos1);

var novasString = s.substring(13,19);
console.log(novasString);

var frase = "Olá mundo";
if(frase.startsWith("Olá")){
    let sub = frase.substring(4);
    let novasString = sub.replace("mundo","pessoal")
    let novasStringMaisucula = novasString.toUpperCase()
    console.log(novasStringMaisucula)
}