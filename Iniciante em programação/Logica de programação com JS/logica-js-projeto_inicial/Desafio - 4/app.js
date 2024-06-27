// 1.
console.log("Boas Vindas a area de console da pagina!!!");
// 2.
let nome = "Vitor";
console.log(`Olá, ${nome}!`);
// 3.
alert(`Olá, ${nome}!`);
// 4.
let resposta = prompt("Qual a linguagem de programação que você mais gosta?");
console.log(resposta)
// 5.
let valor1 = 1, valor2 = 9, resultado = valor1+valor2;
console.log(`A soma de ${valor1} e ${valor2} é igual a ${resultado}.`);
// 6.
resultado = valor1 - valor2;
console.log(`A diferença entre ${valor1} e ${valor2} é igual a ${resultado}.`);
// 7.
let idade = prompt("Insira sua idade no campo abaixo");
if(idade<18){
    console.log("O úsuario é menor de idade");
}else{
    console.log("O úsuario é maior de idade");
}
// 8.
let numero = prompt("Digite um número no campo abaixo");
if(numero>0){
    alert(`O numero ${numero} é positivo`);
}else if(numero<0){
    alert(`O numero ${numero} é negativo`);
}else if(numero==0){
    alert("O numero 0 é nulo");
}else{
    alert("Insira um numero na caixa de texto")
}
// 9.
let wNum = 1;
while(wNum!=10){
    alert(wNum)
    wNum++;
}
// 10.
let nota = prompt("Digite a nota");
if(nota >= 7){
    console.log("Aprovado");
}else{
    console.log("Repovado");
}
// 11.
let r = parseInt(Math.random() * 10 + 1);
console.log(r);
// 12.
r = parseInt(Math.random() * 10 + 1);
console.log(r);
// 13.
r = parseInt(Math.random() * 1000 + 1);
console.log(r);


