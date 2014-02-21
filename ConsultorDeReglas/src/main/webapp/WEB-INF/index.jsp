<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Consultor de reglas</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- Bootstrap -->
<link href="<c:url value="/bootstrap/css/bootstrap.min.css" />"
	rel="stylesheet" media="screen">

</head>
<body>
	<div class="container">

		<div class="page-header">
			<h1>
				<p>Consultor de reglas</p>
				<small>para probar el funcionamiento de las reglas en Drools</small>
			</h1>
		</div>

		<form action="calculate" method="get">
			<fieldset>
				<legend> Canal </legend>
				<div class="controls">
					<select name="modoTransporte">
						<option>AEREO</option>
						<option>TERRESTRE</option>
						<option>PROPIOS MEDIOS</option>
						<option>FLUVIAL</option>
					</select> <label class="help-inline">Modo de transporte</label>
				</div>
				<div class="controls">
					<select name="destino">
						<option>EX_DEF</option>
					</select> <label class="help-inline">Destino</label>
				</div>
				<div class="controls">
					<select name="tipoDespacho">
						<option>NORMAL</option>
						<option>ANTICIPADO</option>
						<option>URGENTE</option>
					</select> <label class="help-inline">Tipo de despacho</label>
				</div>
				<div class="controls">
					<select name="verificacionDeDocumento">
						<option>MANUAL</option>
						<option>AUTOMATICA</option>
					</select> <label class="help-inline">Verificaci&oacute;n del
						documento de soporte</label>
				</div>
				<div class="controls">
					<select name="mercancia">
						<option>MADERA</option>
						<option>SOYA</option>
						<option>ORO</option>
						<option>PLATA</option>
						<option>MINERALES</option>
						<option>VEGETALES</option>
						<option>FRUTAS</option>
					</select> <label class="help-inline">Mercanc&iacute;a</label>
				</div>
				<div class="controls">
					<select name="tipoDocumento">
						<option>CI</option>
						<option>NIT</option>
					</select> <label class="help-inline">Tipo de documento de
						identificaci&oacute;n</label>
				</div>
			</fieldset>
			<fieldset>
				<legend> Columna despachante </legend>
				<div class="controls">
					<div class="control-group">
						<input type="number" class="input-medium"
							name="despachanteContravenciones" placeholder="CONTRAVENCIONES" />
						<input type="number" class="input-medium"
							name="despachanteDelitos" placeholder="DELITOS" /> <input
							type="number" class="input-medium" name="despachantePendientes"
							placeholder="PENDIENTES" /> <input type="number"
							class="input-medium" name="despachanteAnuladas"
							placeholder="ANULADAS" /> <input type="number"
							class="input-medium" name="despachanteModificadas"
							placeholder="MODIFICADAS" />
					</div>
				</div>
			</fieldset>
			<fieldset>
				<legend> Columna n&uacute;mero de documento </legend>
				<div class="controls">
					<div class="control-group">
						<input type="number" class="input-medium"
							name="documentoContravenciones" placeholder="CONTRAVENCIONES" />
						<input type="number" class="input-medium" name="documentoDelitos"
							placeholder="DELITOS" /> <input type="number"
							class="input-medium" name="documentoPendientes"
							placeholder="PENDIENTES" /> <input type="number"
							class="input-medium" name="documenntoAnuladas"
							placeholder="ANULADAS" />
						<div class="pull-right">
							<label class="help-inline">PRIMERIZO</label> <input
								type="checkbox" class="input-medium" name="documentoPrimerizo"
								placeholder="PRIMERIZO" />
						</div>
					</div>
				</div>
			</fieldset>

			<div class="form-actions">
				<button type="submit" class="btn btn-primary">Calcular</button>
				<button type="reset" class="btn">Reset</button>
				<div class="text-info text-right success pull-right">
					<p>${result}</p>
				</div>
			</div>
		</form>
	</div>
	<script src="<c:url value="http://code.jquery.com/jquery.js"/>"></script>
	<script src="<c:url value="/bootstrap/js/bootstrap.min.js" />"></script>
</body>


</html>