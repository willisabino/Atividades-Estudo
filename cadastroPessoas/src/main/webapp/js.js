const btn = document.querySelector('#limpar')

btn.addEventListener('click', () => {
    	inputId.value = "";
	inputNome.value = "";
	inputId.value = "";
})


const input = document.querySelector('#alterar')

input.disable = true



function limparCampo(){
	inputId.value = "";
	inputNome.value = "";
	inputId.value = "";
}


function limpar(){
	document.getElementById("id").value=""
	document.getElementById("nome").value=""
	document.getElementById("idade").value=""
}


function limpar(){
	document.getElementById("id").value="";
	document.getElementById("nome").value="";
	document.getElementById("idade").value="";
}

function bloquear(){
	alert("teste");
    const id = document.querySelector('#id').value;

    if(id){
        document.querySelector('#alterar').disabled = false;
        return;
    }
    document.querySelector('#alterar').disabled = true;
}