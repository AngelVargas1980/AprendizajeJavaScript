/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/ClientSide/javascript.js to edit this template
 *
 **Autor Angel Vargas
 **/


function lanzarMensaje(){
    alert('Tus datos fueron guardados');
}

alert('jajaja');



function enviarFormularioOpcion2(){
	const XHR = new XMLHttpRequest();
	  var formData = new FormData(document.getElementById('contact-form'));

	  // Define what happens on successful data submission
	  XHR.addEventListener('load', (event) => {
	    alert('Yes Angel Vargas! Tus datos fueron enviados y cargados.');
	  });

	  // Define what happens in case of error
	  XHR.addEventListener('error', (event) => {
	    alert('Oops! Something went wrong.');
	  });

	  // Set up our request
	  XHR.open('POST', 'UrlServlet');

	  // Send our FormData object; HTTP headers are set automatically
	  XHR.send(formData);
	
}


function enviarFormulario(){
	let request = new XMLHttpRequest();
request.open('POST', 'UrlServlet', true);
request.setRequestHeader('Content-Type', 'application/json; charset=UTF-8');

request.onreadystatechange = function() {
  if (request.readyState == XMLHttpRequest.DONE) {
    // Peticion terminada.
    if (request.status == 200) {
      // Todo salio bien
      console.log(request.response);
    } else {
      console.log("Error en el envío " + request.response);
    }
  }
}

var formData = new FormData(document.getElementById('contact-form'));
request.send(formData);
}



