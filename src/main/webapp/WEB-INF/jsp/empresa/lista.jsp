<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista de empresas</title>
</head>

<body>

	<a href="/empresa/novo">Nova empresa</a>
	<table>
		<thead>
			<tr>
				<td>Codigo</td>
				<td>Nome</td>
			</tr>
		</thead>

		<tbody>
			<c:forEach items="${empresa}" var="empresa">
				<tr>
					<td><a href="/pessoa/visualizar/${empresa.codigo}"> ${empresa.codigo}</a></td>
					<td>${empresa.nome}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>

</html>