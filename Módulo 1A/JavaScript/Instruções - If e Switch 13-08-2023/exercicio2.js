var totalCompra = 150;
var desconto = "";

if (totalCompra > 200){
    desconto = "20%";

} else if (totalCompra > 100){
    desconto = "10%";
} else if (totalCompra > 50){
    desconto = "5%";
} else {
    desconto = "Sem desconto";
}

console.log(desconto);