<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<label for="empresa">Empresa</label>
<select id="empresa" name="empresa.codigo">
	<option></option>
	<c:set var="selecionado" value="" />

	<c:forEach items="${empresas}" var="empresa">
		<c:choose>
			<c:when test="${empresa.codigo eq pedido.empresa.codigo}">
				<c:set var="selecionado" value="selected" />
			</c:when>
			<c:otherwise>
				<c:set var="selecionado" value="" />
			</c:otherwise>
		</c:choose>

		<option value="${empresa.codigo}" ${selecionado}>${empresa.codigo}-${empresa.nome}
		</option>
	</c:forEach>
</select>

<label for="fornecedor">Fornecedor</label>
<select id="fornecedor" name="fornecedor.codigo">
	<option></option>
	<c:set var="selecionado" value="" />

	<c:forEach items="${fornecedores}" var="fornecedor">
		<c:choose>
			<c:when test="${fornecedor.codigo eq pedido.fornecedor.codigo}">
				<c:set var="selecionado" value="selected" />
			</c:when>
			<c:otherwise>
				<c:set var="selecionado" value="" />
			</c:otherwise>
		</c:choose>

		<option value="${fornecedor.codigo}" ${selecionado}>${fornecedor.nome}</option>
	</c:forEach>
</select>