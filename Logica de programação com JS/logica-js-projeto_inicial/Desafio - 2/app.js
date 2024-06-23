let respostaDiaDaSemana = prompt("Qual é o dia da semana?");
if(respostaDiaDaSemana == "Sábado"||respostaDiaDaSemana == "Domingo"){
    alert("Bom final de semana!!!");
}else{
    alert("Boa semana!!!");
}
let respostaNumeroPositivoOuNegativo = prompt("Digite qualquer número.");
if(respostaNumeroPositivoOuNegativo>0){
    alert("O numero digitado é POSITIVO!!!");
}else if(respostaNumeroPositivoOuNegativo<0){
    alert("O numero digitado é NEGATIVO!!!");
}else{
    alert("O numero digitado é 0 ele é nulo");
}
let pontuacao = prompt("Qual foi a pontuação?");
if(pontuacao>=100){
    alert("Parabéns você venceu!");
}else{
    alert("Tente novamente para ganhar.");
}
let saldo = prompt("Digite seu saldo.")
alert(`Seu saldo é ${saldo}`);
let nome = prompt("Escreva o seu nome");
alert("Boas vindas "+nome);