<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista de produtos</title>
</head>

<body>

	<a href="/produto/novo">Nova produto</a>
	<table>
		<thead>
			<tr>
				<td>Codigo</td>
				<td>Descrição</td>
				<td>Quantidade unitaria</td>
				<td>Preço</td>
			</tr>
		</thead>

		<tbody>
			<c:forEach items="${produto}" var="produto">
				<tr>
					<td><a href="/produto/visualizar/${produto.codigo}"> ${produto.codigo}</a></td>
					<td>${produto.nome}</td>
					<td>${produto.quantidade_unitaria}</td>
					<td>${produto.preco}</td>					
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>

</html>