<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista de fornecedores</title>
</head>

<body>

	<a href="/fornecedor/novo">Nova fornecedor</a>
	<table>
		<thead>
			<tr>
				<td>Codigo</td>
				<td>Nome</td>
			</tr>
		</thead>

		<tbody>
			<c:forEach items="${fornecedor}" var="fornecedor">
				<tr>
					<td><a href="/fornecedor/visualizar/${fornecedor.codigo}"> ${fornecedor.codigo}</a></td>
					<td>${fornecedor.nome}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>

</html>