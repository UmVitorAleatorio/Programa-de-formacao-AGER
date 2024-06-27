let amigos = [];

function adicionar(){
    let amigo = document.getElementById('nome-amigo');
    if(amigo.value == ''){
        alert('Informe o nome do amigo!');
        return;
    }

    if(amigos.includes(amigo.value)){
        alert('Nome já adicionado, por favor coloque uma diferenciação ao nome!');
        return;
    }

    let lista = document.getElementById('lista-amigos');
    amigos.push(amigo.value);

    if(lista.textContent == ''){
        lista.textContent = amigo.value;
    }else{
        lista.textContent = lista.textContent + ', ' + amigo.value;
    }
    amigo.value = '';
}

function sortear(){
    if(amigos.length < 4){
        alert('Insira no minimo 4 nomes antes de sortear!!!');
        return;
    }
    embaralha(amigos);
    let listaSorteio = document.getElementById('lista-sorteio');

    for( let i = 0; i < amigos.length; i++){
        if(i == amigos.length - 1){
            listaSorteio.innerHTML = listaSorteio.innerHTML + amigos[i]+ ' --> ' + amigos[0] + '<br>'
        }else{
            listaSorteio.innerHTML = listaSorteio.innerHTML + amigos[i]+ ' --> ' + amigos[i+1] + '<br>'
        }
    }
}

function embaralha(lista){
    for (let i = lista.length; i; i--){
        const iAleatorio = Math.floor(Math.random()*i);

        [lista[i - 1], lista[iAleatorio]] =
             [lista[iAleatorio], lista[i-1]];
    }
}

function reiniciar(){
    amigos  = [];
    document.getElementById('lista-amigos').innerHTML = '';
    document.getElementById('lista-sorteio').innerHTML = '';
}