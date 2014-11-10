/**
 * 
 */

var util = {
	callAjax : function(url, params) {

		$.ajax({
			data : params,
			url : url,
			cache : false,
			traditional : true,
			type : "POST",
			dataType : 'json',
			async : false,
			success : function(result) {
				alert("Mostramos el  objeto JSON Folio " + result.body.fcFolio
						+ "\n \n Fecha " + result.body.fcFecha);
			}
		});

	},
	callAlertError: function (message, div) {

		$(div).html('<div class="alert alert-danger alert-error"><a href="#" class="close" data-dismiss="alert">&times;</a><strong>Error!</strong> ' + message + '</div></div>');
		$(div).alert();
		setTimeout(function() { 
		      $(div).alert('close');
		    }, 5000);
		
	},
	callModelAlert : function(mensaje) {
		
		$('#label-alert').html(mensaje)
		$('#modalAlert').modal('show');
		
	},
	buildSelect : function(selector, id, data) {
	    if (data != null) {
	        $(selector)
	            .append('<option value="' + id + '">' + data + '</option>');
	    } else {
	        $(selector)
	            .append('<option value="-1">Sin Datos</option>');
	    }
	}
}