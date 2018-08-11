<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<table>
	<thead>
		<tr>
			<td></td>
			<td>Codigo</td>
			<td>Quantidade</td>
			<!-- 			<td>Pedido</td> -->
			<td>Produto</td>
		</tr>
	</thead>

	<tbody>
		<c:forEach items="${pedidoitens}" var="pedidoitem">
			<tr>
				<td><a href="/pedido/${pedidoitem.pedido.codigo}/item/${pedidoitem.codigo}/deletar"><input
						name="deletar" type="button" id="deletar" class="deletar"
						value="-"></a></td>
				<td>${pedidoitem.codigo}</td>
				<td>${pedidoitem.quantidade}</td>
				<%-- 				<td>${pedidoitem.pedido.codigo}</td> --%>
				<td>${pedidoitem.produto.codigo}-${pedidoitem.produto.nome}</td>
			</tr>
		</c:forEach>
		
		<form action="/pedido/${pedido.codigo}/salvar" method="post">
			<input type="hidden" name="pedido.codigo" id="pedido.codigo"
				value="${pedido.codigo}">
			<tr>
				<td><input name="adicionar" type="submit" id="adicionar"
					value="+"></td>
				<td></td>
				<td><input type="text" name="quantidade" id="quantidade"
					value=""></td>
				<td><c:import url="_campos-produto.jsp" /></td>
			</tr>
		</form>
	</tbody>
</table>
