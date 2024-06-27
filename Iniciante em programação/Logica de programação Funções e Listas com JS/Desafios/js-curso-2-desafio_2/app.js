
//1

function Console(){
    console.log("Olá, mundo!");
}

//2

let nome = prompt("Escreva um nome!");
function ConsoleNome(nome){
    console.log(`Olá ${nome}!`);
}

//3

let n1 = ConsoleNumeroDobro();
function ConsoleNumeroDobro(){
    return parseInt(prompt("Digite um numero para dobrar"))*2;
}
console.log(n1);

//4

let media = recebeTresNumeros(5,7,10);
function recebeTresNumeros(num1,num2,num3){
    return (num1+num2+num3)/3;
}
console.log(media);

//5

let maior = maiorNum(8,9);
function maiorNum(num1,num2){
    if(num1>=num2){
        return num1;
    }else{
        return num2;
    }
}
console.log(maior);

//6

let multi = multiEleMesmo(6);
function multiEleMesmo(num1){
    return num1*num1;
}
console.log(multi);