<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista de pessoas</title>
</head>

<body>

	<a href="/pessoa/novo">Nova pessoa</a>
	<table>
		<thead>
			<tr>
				<td>Codigo</td>
				<td>Nome</td>
				<td>CPF</td>
				<td>Naturalidade</td>
			</tr>
		</thead>

		<tbody>
			<c:forEach items="${pessoas}" var="pessoa">
				<tr>
					<td><a href="/pessoa/visualizar/${pessoa.codigo}"> ${pessoa.codigo}</a></td>
					<td>${pessoa.nome}</td>
					<td>${pessoa.cpf}</td>
					<td>${pessoa.naturalidade.nome}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>

</html>