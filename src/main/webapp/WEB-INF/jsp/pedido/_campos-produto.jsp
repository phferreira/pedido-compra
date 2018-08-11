<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<select id="produto" name="produto.codigo">
	<option></option>
	<c:set var="selecionado" value="" />

	<c:forEach items="${produtos}" var="produto">
		<c:choose>
			<c:when test="${produto.codigo eq pedidoitem.produto.codigo}">
				<c:set var="selecionado" value="selected" />
			</c:when>
			<c:otherwise>
				<c:set var="selecionado" value="" />
			</c:otherwise>
		</c:choose>

		<option value="${produto.codigo}" ${selecionado}>${produto.codigo}
			- ${produto.nome}</option>
	</c:forEach>
</select>