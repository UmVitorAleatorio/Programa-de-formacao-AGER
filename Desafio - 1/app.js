alert("Boas vindas ao nosso site!");
let nome = "lua", idade = 25, numeroDeVendas = 50, SaldoDisponivel = 1000, mensagemDeErro = "Erro! Preencha todos os campos";
alert("Erro! Preencha todos os campos");
alert(mensagemDeErro);
nome = prompt("Escreva aqui o seu nome");
idade = prompt("Digite aqui sua idade");
if(idade>=18){
    alert("Já pode tirar a habilitação!");
}