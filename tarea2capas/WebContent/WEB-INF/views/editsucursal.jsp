<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pagina inicial</title>

<link rel="stylesheet" href="resources/app.css">



</head>
<body>

<div class="container">
    <div class="row center-block">
        <div class="col-md-8 col-md-offset-2">
            <div class="panel panel-default">
                <div class="panel-heading">Sucursal</div>

                <div class="panel-body">
                    <form:form id="form1" class="form-horizontal" method="POST" action="${pageContext.request.contextPath}/savesucursal" modelAttribute="sucursal">

                        <div class="form-group">
                            <label for="snombre" class="col-md-4 control-label">Nombre</label>

                            <div class="col-md-6">
                                <form:input class="form-control" name="nombre" type="text" id="nombre" path="snombre" value="" required="" autofocus="" />
                                <td><form:errors path="snombre" cssStyle="color: #ff0000;"/></td>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="subicacion" class="col-md-4 control-label">Ubicacion</label>

                            <div class="col-md-6">
                                <form:input id="ubicacion" name="ubicacion" type="text" class="form-control" path="subicacion" value="" required="" />
                                <td><form:errors path="subicacion" cssStyle="color: #ff0000;"/></td>
                            </div>
                        </div>
                        
                        <div class="form-group">
                            <label for="sentrada" class="col-md-4 control-label">Hora de entrada</label>

                            <div class="col-md-6">
                                <form:input id="entrada" name="entrada" type="text" class="form-control" path="sentrada" value="" required="" />
                                <td><form:errors path="sentrada" cssStyle="color: #ff0000;"/></td>
                            </div>
                        </div>
                        
                        <div class="form-group">
                            <label for="ssalida" class="col-md-4 control-label">Hora de salida</label>

                            <div class="col-md-6">
                                <form:input id="salida" name="salida" type="text" class="form-control" path="ssalida" value="" required="" />
                                <td><form:errors path="ssalida" cssStyle="color: #ff0000;"/></td>
                            </div>
                        </div>
                        
                        <div class="form-group">
                            <label for="inmesas" class="col-md-4 control-label"># Mesas</label>

                            <div class="col-md-6">
                                <form:input id="nmesas" name="nmesas" type="number" class="form-control" path="inmesas" value="" required="" />
                                <td><form:errors path="inmesas" cssStyle="color: #ff0000;"/></td>
                            </div>
                        </div>
                        
                        <div class="form-group">
                            <label for="sgerente" class="col-md-4 control-label">Gerente</label>

                            <div class="col-md-6">
                                <form:input id="gerente" name="gerente" type="text" class="form-control" path="sgerente" value="" required="" />
                                <td><form:errors path="sgerente" cssStyle="color: #ff0000;"/></td>
                            </div>
                        </div>

                        <div class="form-group">
                            <div class="col-md-8 col-md-offset-4">
                                <button type="submit" class="btn btn-primary">
                                    Crear
                                </button>
                            </div>
                        </div>
                        <c:choose>
							<c:when test="${resultado==0}">
								<span><b>Ocurrio un error al guardar la sucursal</b></span>
							</c:when>
						</c:choose>
                    </form:form>
                </div>
            </div>
        </div>
    </div>
</div>



<!-- Scripts -->
<script type="text/javascript" src="resources/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="resources/popper.min.js"></script>
<script type="text/javascript" src="resources/bootstrap.min.js"></script>
</body>
</html>