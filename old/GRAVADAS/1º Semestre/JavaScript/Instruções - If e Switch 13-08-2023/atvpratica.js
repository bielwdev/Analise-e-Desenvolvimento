var bebida = "café";
var valor = "";

switch(bebida){
    case "café":
        valor = "R$7,00"
        console.log("A bebida",bebida, "custa:", valor)
        break;
    case "chá":
        valor = "R$12,00"
        console.log("A bebida",bebida, "custa:", valor)
        break;
    case "leite":
        valor = "R$5,00"
        console.log("A bebida",bebida, "custa:", valor)
        break; 
    default:
        console.log(" Escolha um dos itens disponíveis em nosso cardápio: leite, café ou chá.")
    break;
}

