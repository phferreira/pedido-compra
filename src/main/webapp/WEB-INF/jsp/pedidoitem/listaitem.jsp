<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<table>
	<thead>
		<tr>
			<td></td>
			<td>Codigo</td>
			<td>Quantidade</td>
			<td>Pedido</td>
			<td>Produto</td>
		</tr>
	</thead>

	<tbody>
		<c:forEach items="${pedidoitens}" var="pedidoitem">
			<tr>
			    <td><input name="remover" type="button" id="remover" class="remover" value="-"></td>
				<td><a href="/pedidoitem/visualizar/${pedidoitem.codigo}">${pedidoitem.codigo}</a></td>
				<td>${pedidoitem.quantidade}</td>
				<td>${pedidoitem.pedido.codigo}</td>
				<td>${pedidoitem.produto.nome}</td>
			</tr>
		</c:forEach>
		<form action="/pedido/salvar/${pedido.codigo}" method="post">
			<tr>
				<td><input name="adicionar" type="button" id="adicionar" value="+"></td>
				<td> - </td>
				<td><input type="text" name="quantidade" id="quantidade" value=""></td>
				<td><input type="text" name="pedido" id="pedido" value="${pedido.codigo}"></td>
<%-- 				<td><c:import url="/pedido/_campos-produto.jsp"/></td> --%>
			</tr>
		</form>
	</tbody>
</table>
