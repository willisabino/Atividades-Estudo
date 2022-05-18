function limpar(){
	document.getElementById("id").value="";
	document.getElementById("nome").value="";
	document.getElementById("idade").value="";
}


setTimeout(function bloquear() {
	 const id = document.querySelector('#id').value;
	 const nome = document.querySelector('#nome').value;

    if(id && nome){
        document.querySelector('#alterar').hidden = false;
        document.querySelector('#inserir').hidden = true;
        return;
    }
    document.querySelector('#alterar').hidden = true;
            document.querySelector('#inserir').hidden = false;
}, 1000);



function alterar(){
	with(document.forms[0]){
		
	}
}




function bloquear2(){
	alert("teste");
    const id = document.querySelector('#id').value;

    if(id){
        document.querySelector('#alterar').disabled = false;
        return;
    }
    document.querySelector('#alterar').disabled = true;
}