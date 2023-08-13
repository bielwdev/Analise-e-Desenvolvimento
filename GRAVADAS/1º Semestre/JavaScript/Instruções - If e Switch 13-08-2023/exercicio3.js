var produto = "leite";
var categoria = "";

switch(produto){
    case "arroz":
    case "feijão":
    case "macarrão":
        categoria = "Alimentos";
        break;
    case "sabonete":
    case "shampoo":
    case "pasta de dente":
        categoria = "Higinene Pessoal";
        break;
    case "caderno":
    case "lápis":
    case "borracha":
         categoria = "Material Escolar";
        break;
        
    default:
        categoria = "Categoria não definida!"
        break;
}

console.log("A categoria do produto", produto, "é", categoria)
