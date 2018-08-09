
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<label for="empresa">Empresa</label>
<select id="empresa" name="empresa.codigo">
	<option></option>
	<c:set var="selecionado" value=""/>
	
	<c:forEach items="${empresas}" var="empresa">
		<c:if test="${empresa.codigo eq pedido.empresa.codigo}">
			<c:set var="selecionado" value="Selected"/>
		</c:if>	
		<option value="${empresa.codigo}"> ${empresa.nome}</option>
	</c:forEach>
</select>

<label for="fornecedor">Fornecedor</label>
<select id="fornecedor" name="fornecedor.codigo">
	<option></option>
	<c:set var="selecionado" value=""/>
	
	<c:forEach items="${fornecedores}" var="fornecedor">
		<c:if test="${fornecedor.codigo eq pedido.fornecedor.codigo}">
			<c:set var="selecionado" value="Selected"/>
		</c:if>	
		<option value="${fornecedor.codigo}"> ${fornecedor.nome}</option>
	</c:forEach>
</select>