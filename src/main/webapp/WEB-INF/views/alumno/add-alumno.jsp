<br7>
<form class="form-horizontal">
	<fieldset>

		<!-- Form Name -->
		<legend>Ingresar Alumno</legend>

		<!-- Text input-->
		<div class="form-group">
			<label class="col-md-4 control-label" for="al_rut_id">Rut</label>
			<div class="col-md-4">
				<input id="al_rut_id" name="al_rut_id" type="text"
					placeholder="Ej: 13735003-3" class="form-control input-md"
					required="">

			</div>
		</div>

		<!-- Text input-->
		<div class="form-group">
			<label class="col-md-4 control-label" for="al_primer_nombre">Primer
				Nombre</label>
			<div class="col-md-4">
				<input id="al_primer_nombre" name="al_primer_nombre" type="text"
					placeholder="Ej: Rafael" class="form-control input-md" required="">

			</div>
		</div>

		<!-- Text input-->
		<div class="form-group">
			<label class="col-md-4 control-label" for="al_segundo_nombre">Segundo
				Nombre</label>
			<div class="col-md-4">
				<input id="al_segundo_nombre" name="al_segundo_nombre" type="text"
					placeholder="Ej: Patricio" class="form-control input-md">

			</div>
		</div>

		<!-- Text input-->
		<div class="form-group">
			<label class="col-md-4 control-label" for="al_primer_apellido">Primer
				Apellido</label>
			<div class="col-md-4">
				<input id="al_primer_apellido" name="al_primer_apellido" type="text"
					placeholder="Ej: Aliaga" class="form-control input-md" required="">

			</div>
		</div>

		<!-- Text input-->
		<div class="form-group">
			<label class="col-md-4 control-label" for="al_segundo_apellido">Segundo
				Apellido</label>
			<div class="col-md-4">
				<input id="al_segundo_apellido" name="al_segundo_apellido"
					type="text" placeholder="E: Alvarez" class="form-control input-md">

			</div>
		</div>

		<!-- Select Basic -->
		<div class="form-group">
			<label class="col-md-4 control-label" for="cu_id">Curso</label>
			<div class="col-md-4">
				<select id="cu_id" name="cu_id" class="form-control">
					<option value="0">Seleccione curso</option>
				</select>
			</div>
		</div>

		<!-- Multiple Checkboxes -->
		<div class="form-group">
			<label class="col-md-4 control-label" for="colaciones">Colaciones</label>
			<div class="col-md-4">
				<div class="checkbox">
					<label for="colaciones-0"> <input type="checkbox"
						name="colaciones" id="colaciones-0" value="1"> Desayuno
					</label>
				</div>
				<div class="checkbox">
					<label for="colaciones-1"> <input type="checkbox"
						name="colaciones" id="colaciones-1" value="2"> Almuerzo
					</label>
				</div>
				<div class="checkbox">
					<label for="colaciones-2"> <input type="checkbox"
						name="colaciones" id="colaciones-2" value="3"> Tercera
						Colaci�n
					</label>
				</div>
			</div>
		</div>

		<!-- Button -->
		<div class="form-group">
			<label class="col-md-4 control-label" for="add-alumno"></label>
			<div class="col-md-4">
				<button id="add-alumno" name="add-alumno" class="btn btn-primary">Agregar</button>
			</div>
		</div>

	</fieldset>
</form>

<script type="text/javascript">
	$(document).ready(function() {
		defaulLayaout.callCursos();
	});
</script>