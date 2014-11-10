/**
 * 
 */

var login = {
		validaMensaje : function(respuesta){

			if(!respuesta){
				login.callAlertError('Datos Ingresados Incorrectos.');
				
			}
		},
		callAlertError: function (message) {

			$('#alertErrorLogin').html('<div class="alert alert-danger alert-error"><a href="#" class="close" data-dismiss="alert">&times;</a><strong>Error!</strong> ' + message + '</div></div>');
			$("#alertErrorLogin").alert();
			setTimeout(function() { 
			      $("#alertErrorLogin").alert('close');
			    }, 5000);
			
		}
}