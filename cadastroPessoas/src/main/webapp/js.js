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