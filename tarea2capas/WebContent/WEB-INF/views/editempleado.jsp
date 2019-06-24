<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form2" uri="http://www.springframework.org/tags/form" %>
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
                <div class="panel-heading">Empleado</div>

                <div class="panel-body">
                    <form2:form id="form2" class="form-horizontal" method="POST" action="${pageContext.request.contextPath}/savempleado" modelAttribute="empleado">

                         <div class="form-group">
                            <label for="sempleado" class="col-md-4 control-label">Name</label>

                            <div class="col-md-6">
                                <form2:input id="empleado" name="empleado" type="text" class="form-control" path="sempleado" value="" required="" />
                                <td><form2:errors path="sempleado" cssStyle="color: #ff0000;"/></td>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="iedad" class="col-md-4 control-label">Edad</label>

                            <div class="col-md-6">
                                <form2:input id="edad" name="edad" type="number" class="form-control" path="iedad" value="" required="" />
                                <td><form2:errors path="iedad" cssStyle="color: #ff0000;"/></td>
                            </div>
                        </div>
                        
                        <div class="form-group">
                            <label for="sgenero" class="col-md-4 control-label">Genero</label>

                            <div class="col-md-6">
                                <form2:input id="genero" name="genero" type="text" class="form-control" path="sgenero" value="" required="" />
                                <td><form2:errors path="sgenero" cssStyle="color: #ff0000;"/></td>
                            </div>
                        </div>
                        
                        <div class="form-group">
                            <label for="bestado" class="col-md-4 control-label">Estado</label>

                            <div class="col-md-6">
                                <form2:input id="salida" name="salida" type="text" class="form-control" path="bestado" value="" required="" />
                                <td><form2:errors path="bestado" cssStyle="color: #ff0000;"/></td>
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
								<span><b>Ocurrio un error al guardar al empleado</b></span>
							</c:when>
						</c:choose>
                    </form2:form>
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