var defaulLayaout ={
	    callHomeClean: function(){
	    	 $('#contenido').load('home-clean.htm');
	    },
	    callViewAddAlumnos: function(){
	    	 $('#contenido').load('view-add-alumnos.htm');
	    },
	    callViewAddEncargado: function(){
	    	 $('#contenido').load('view-add-encargado.htm');
	    },
	    callSalir: function (pais){
	    	window.location = 'salir.htm';
	    },
	    callCursos : function() {

			$.ajax({
				url : 'get-cursos.htm',
				cache : false,
				traditional : true,
				type : "POST",
				async : false,
				success : function(data) {
					data =  jQuery.parseJSON(data);
					 if (data.success) {
						 var dataCursos = data.body != null ? data.body : '';
						 $('#cu_id').empty().append('<option value="0">Seleccione un curso...</option> ');
					        if (dataCursos != '') {
					            $.each(dataCursos, function () {
					                util.buildSelect("#cu_id", this.col_id, this.col_descripcion);
					            });
					        }
						
					} else {
						util.callModelAlert('Curos no encontrados');
					}

				}
			});
			
		}
}