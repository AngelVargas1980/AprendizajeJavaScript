/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */

 function sendForm(){
	const XHR = new XMLHttpRequest();
	  var formData = new URLSearchParams(new FormData(document.getElementById('form'))).toString();
         
	  // Define what happens in case of error
	  XHR.addEventListener('error', (event) => {
	    alert('Oops! Something went wrong.');
	  });

	  // Set up our request
	  XHR.open('POST', 'TruckController', true);
          XHR.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
          
          XHR.onload = () => {
            if (XHR.readyState === XHR.DONE && XHR.status === 200) {
              console.log("response => " + XHR.response);
              showMessage('Camión Registrado Exitosamente');
            }
          };   
          XHR.send(formData);         
}




function showMessage(message){
  Swal.fire({
  title: message,
  width: 600,
  padding: '3em',
  color: '#716add',
  background: '#fff url(./images/wallAlert.png)',
  backdrop: `
    rgba(0,0,123,0.4)
    url("images/truckGif.gif")
    left top
    no-repeat
  `   
});
}