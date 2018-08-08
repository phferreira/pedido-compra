<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Alterar empresa</title>
</head>

<body>

	<form action="/empresa/alterar" method="post">

		<input type="hidden" name="codigo" value="${empresa.codigo}">
		
		<c:import url="_campos.jsp"/>

		<button type="submit">Salvar</button> 

		<a href="/empresa/listar">Cancelar</a>
		<a href="/empresa/deletar/${empresa.codigo}">Deletar</a>
	</form>

</body>

</html>