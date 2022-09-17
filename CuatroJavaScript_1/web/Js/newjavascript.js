/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/ClientSide/javascript.js to edit this template
 *
 **Autor Angel Vargas
 **/

function crearElementosDelArray(){
    let botones = document.createElement('button');
    botones.setAttribute("value", "Click Aqui");
}

function eliminarElementosDelArray(){ 
    
	let container= document.getElementById("codigo");
        let container= document.getElementById("nombre");
        let container= document.getElementById("correo");
        let container= document.getElementById("direccion");
        let container= document.getElementById("opcion");
   
	container.remove();
}



function lanzarMensaje(){
    alert('Tus datos fueron guardados');
}

alert('Prueba UMG');

alert('Tus datos fueron guardados');


function enviarFormularioOpcion2(){
	const XHR = new XMLHttpRequest();
	  var formData = new FormData(document.getElementById('contact-form'));

	  // Define what happens on successful data submission
	  XHR.addEventListener('load', (event) => {
	    alert('Yes Angel! Tus datos enviados y cargados.');
	  });

	  // Define what happens in case of error
	  XHR.addEventListener('error', (event) => {
	    alert('Oops! Something went wrong.');
	  });

	  // Set up our request
	  XHR.open('POST', '/UrlServlet');

	  // Send our FormData object; HTTP headers are set automatically
	  XHR.send(formData);
	
}


