var tempoAmarelo, tempoVerde, tempoVermelho;

function ligaSemaforo(){
    verde();
}

function verde(){
    ledDesligado();
    document.getElementById("verde").className = "conf-global verde";
    tempoVerde = setTimeout(amarelo, 7000);
}

function amarelo(){
    ledDesligado();
    document.getElementById("amarelo").className = "conf-global amarelo";
    tempoAmarelo = setTimeout(vermelho, 3000);
}

function vermelho(){
    ledDesligado();
    document.getElementById("vermelho").className = "conf-global vermelho";
    //agendando a proxima execucao do led verde
    tempoVermelho = setTimeout(verde, 8000);
}


function ledDesligado(){
    //Chama todos desligados
    document.getElementById("amarelo").className = "conf-global led-desligado";
    document.getElementById("verde").className = "conf-global led-desligado";
    document.getElementById("vermelho").className = "conf-global led-desligado";
}


function desligaSemaforo(){
    //Limpar todos os `Timeout` das funcoes
    clearTimeout(tempoVerde);
    clearTimeout(tempoAmarelo);
    clearTimeout(tempoVermelho);
    ledDesligado();
}