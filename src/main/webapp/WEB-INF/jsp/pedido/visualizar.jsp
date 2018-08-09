<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Alterar pedido</title>
</head>

<body>

	<form action="/pedido/alterar" method="post">

		<input type="hidden" name="codigo" value="${pedido.codigo}">
		
		<c:import url="_campos.jsp"/>

		<button type="submit">Salvar</button> 

		<a href="/pedido/listar">Cancelar</a>
		<a href="/pedido/deletar/${pedido.codigo}">Deletar</a>
	</form>

</body>

</html>