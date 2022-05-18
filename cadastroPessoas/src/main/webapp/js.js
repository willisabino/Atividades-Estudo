function limpar(){
	document.getElementById("id").value="";
	document.getElementById("nome").value="";
	document.getElementById("idade").value="";
}


setTimeout(function bloquear() {
	 const id = document.querySelector('#id').value;

    if(id){
        document.querySelector('#alterar').disabled = false;
        return;
    }
    document.querySelector('#alterar').disabled = true;
}, 1000);


/*function bloquear(){
	alert("teste");
    const id = document.querySelector('#id').value;

    if(id){
        document.querySelector('#alterar').disabled = false;
        return;
    }
    document.querySelector('#alterar').disabled = true;
}*/