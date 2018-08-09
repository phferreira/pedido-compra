<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista de pedido</title>
</head>

<body>

	<a href="/pedido/novo">Novo pedido</a>
	<table>
		<thead>
			<tr>
				<td>Codigo</td>
				<td>Empresa</td>
				<td>Fornecedor</td>
			</tr>
		</thead>

		<tbody>
			<c:forEach items="${pedido}" var="pedido">
				<tr>
					<td><a href="/pedido/visualizar/${pedido.codigo}"> ${pedido.codigo}</a></td>
					<td>${pedido.empresa.nome}</td>
					<td>${pedido.fornecedor.nome}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>

</html>