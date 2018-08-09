<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro de pedido</title>
</head>

<body>

	<form action="/pedido/salvar" method="post">

		<c:import url="_campos.jsp" />

		<input type="submit" name="enviar"> 
		<a href="/pedido/listar">Cancelar</a>
	</form>

</body>

</html>