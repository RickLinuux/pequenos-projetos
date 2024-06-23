function calc(operacao){
    
    if(document.getElementById("numero1").value == "" || document.getElementById("numero2").value == ""){
        alert("Não é possível realizar operação com campos vazios!");
        limpar();
    }else{
        var numero1 = parseFloat(document.getElementById("numero1").value);
        var numero2 = parseFloat(document.getElementById("numero2").value);
        var resultado = 0;
        switch (operacao) {
            case '+': var resultado = numero1 + numero2; break;
            case '-': var resultado = numero1 - numero2; break;
            case '*': var resultado = numero1 * numero2; break;
            case '/':
                if(numero1 != 0){
                    var resultado = numero1 / numero2;
                }else{
                    alert("Não possível dividir por zero, tente novamente.");  
                }
                break;
            default:
                alert("Operação não suporta, tente novamente!");
                break;  
         }
         var historico = "<p>" + numero1 + operacao + numero1 + " = " + resultado + "</p>";
         var primeiroHistorioco = document.getElementById("historico");
         document.getElementById("resultado").value = resultado;
         primeiroHistorioco.innerHTML = historico + primeiroHistorioco.innerHTML;
         //Removendo o 11º filho dentro do array, assim limitando para 10 operações históricas.
         if(primeiroHistorioco.children.length > 10){
            primeiroHistorioco.removeChild(primeiroHistorioco.childNodes[10]);
         }

    }
}
function limpar(){
    document.getElementById("numero1").value = "";
    document.getElementById("numero2").value = "";
    document.getElementById("resultado").value = "";   
    document.getElementById("historico").innerHTML = "";
}


