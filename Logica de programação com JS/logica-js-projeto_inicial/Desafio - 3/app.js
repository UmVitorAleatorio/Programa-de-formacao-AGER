let contador = 1;
while(contador<=10){
    alert(contador);
    contador++;
}
contador--;
while(contador>=0){
    alert(contador);
    contador--;
}
contador = prompt("Digite o maior número da contagem regressiva");
while(contador>=0){
    alert(contador);
    contador--;
}
numeroMax = prompt("Digite o maior número da contagem progressiva");
contador++;
while(contador<=numeroMax){
    alert(contador);
    contador++;
}