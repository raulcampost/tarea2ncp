<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pagina inicial</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<link href="resouces/fw/css/all.css" rel="stylesheet">
<link href="resouces/fw/css/fontawesome.css" rel="stylesheet">
<link href="resouces/fw/css/brands.css" rel="stylesheet">
<link href="resouces/fw/css/solid.css" rel="stylesheet">

</head>
<body style="margin:25px 100px 100px 100px">



<div class="container">
  <div class="row">
    <div class="col-sm-12">
      <h1>Bienvenido </h1>
    </div>
  </div>
  <div class="row">
    <div class="col-sm-12">
      <h2>Aqui se presenta la lista de sucursales de su compañia</h2>
    </div>
  </div>
  <div class="row">
    <div class="col-sm-6 justify-content-start">
    </div>
    <div class="col-sm-6 justify-content-end">
      <a class="btn btn-success" href="${pageContext.request.contextPath}/nuevasucursal" value="" ><i class="fas fa-plus"></i></a><br><br>
    </div>
  </div>
  <div class="row">
    <div class="col-sm-12">
      <div class="datagrid table-responsive">
		<table class="table">
			<thead class="thead-dark">
			<tr>
				<th>Nombre</th>
				<th>ubicacion</th>
				<th>Entrada</th>
				<th>Salida</th>
				<th>Mesas</th>
				<th>Gerente</th>
				<th>Accion</th>
			</tr>
			</thead>
			<c:forEach var="c" items="${sucursal}">
				<tr>
					<td>${c.snombre}</td>
					<td>${c.subicacion}</td>
					<td>${c.sentrada}</td>
					<td>${c.ssalida}</td>
					<td>${c.inmesas}</td>
					<td>${c.sgerente}</td>
					<td> 
						<a class="btn btn-primary" name="id" href="${pageContext.request.contextPath}/sucursalxempleado?id=${c.idsucursal}" value=""><i class="far fa-eye"></i></i></a>
						<a class="btn btn-warning" name="id2" href="#" value=""><i class="far fa-edit"></i></i></a>
						<a class="btn btn-danger" name="id3" href="${pageContext.request.contextPath}/deletesucursal?id=${c.idsucursal}" value=""><i class="far fa-trash-alt"></i></a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
    </div>
  </div>
</div>
	<div class="row">
	    <div class="col-sm-12">
	      <h3>P&aacute;gina ${pagina}, mostrando ${actual} de ${total}</h3>
	<input type="button" class="myButton" onclick="location.href='${pageContext.request.contextPath}/vertodos?direccion=2'" value="Anterior" />
	<input type="button" class="myButton" onclick="location.href='${pageContext.request.contextPath}/vertodos?direccion=1'" value="Siguiente" />
	    </div>
	</div>
	

<script defer src="resources/fw/js/all.js"></script>
<script src="resources/fw/js/brands.js"></script>
<script src="resources/fw/js/solid.js"></script>
<script src="resources/fw/js/fontawesome.js"></script>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>