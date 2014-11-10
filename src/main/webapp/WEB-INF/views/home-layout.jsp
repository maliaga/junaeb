<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon"
	href="${pageContext.request.contextPath}/resources/img/favicon.ico" />

<title>Home :: Asistencia Junaeb</title>

<!-- Bootstrap core CSS -->
<link
	href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Custom styles for this template -->
<link
	href="${pageContext.request.contextPath}/resources/css/home-layout.css"
	rel="stylesheet">

<!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
<!--[if lt IE 9]><script src="../../assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
<script
	src="${pageContext.request.contextPath}/resources/js/ie/ie-emulation-modes-warning.js" /></script>

<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"/>'></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"/>'></script>
    <![endif]-->
</head>

<body>

	<div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">Colegio Lions School</a>
			</div>
			<div class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a href="#" onclick="javascript:defaulLayaout.callHomeClean()">Home</a></li>

					<li class="dropdown">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">Mantenedores<span class="caret"></span></a>
						<ul class="dropdown-menu" role="menu">
							<li><a href="#" onclick="javascript:defaulLayaout.callViewAddAlumnos()">Alumnos</a></li>
							<li class="divider"></li>
							<li><a href="#" onclick="javascript:defaulLayaout.callViewAddEncargado()">Encargado</a></li>
						</ul>
					</li>
					<li><a href="#" onclick="javascript:defaulLayaout.callSalir()">Salir</a></li>
				</ul>
			</div>
			<!--/.nav-collapse -->
		</div>
	</div>

	<div class="container" id="contenido">

		<div class="starter-template">
			<img alt="Colegio Lions School"
				src="${pageContext.request.contextPath}/resources/img/Colegio-009.jpg">
		</div>

	</div>
	<!-- /.container -->


	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script
		src="${pageContext.request.contextPath}/resources/js/jquery-1.11.1.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<script
		src="${pageContext.request.contextPath}/resources/js/ie/ie10-viewport-bug-workaround.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/js/home/init.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/js/common/utils.js"></script>

<jsp:include page="./common/modal-alert.jsp" />
</body>
</html>