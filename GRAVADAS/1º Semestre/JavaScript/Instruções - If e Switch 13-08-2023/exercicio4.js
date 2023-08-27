var livro = "O Senhor dos Anéis"
var localizacao = ""

switch(livro){
    case "Harry Potter":
        localizacao = "Prateleira A"
        break;
    case "Percy Jackson":
        localizacao = "Prateleira B"
        break;
    case "O Senhor dos Anéis":
        localizacao = "Prateleira C"
        break;
    default:
        localizacao = "Localização não encontrada"
        break;
}

console.log("O livro", livro, "está na", localizacao)