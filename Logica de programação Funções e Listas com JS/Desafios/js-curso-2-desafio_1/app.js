let titulo = document.querySelector("h1");
titulo.innerHTML = "Hora do desafio";

function ConsoleClique(){
    console.log("O botão foi clicado");
}
function AlertClique(){
    alert("Eu amo JS");
}
function PromptClique(){
    let cidade = prompt("Fale uma cidade do Brasil");
    alert(`Estive em ${cidade} e lembrei de você`);
}
function SomaClique(){
    let n1 = parseInt(prompt("Digite um número"));
    n1 += parseInt(prompt("Digite outro número"));
    alert(n1);
}