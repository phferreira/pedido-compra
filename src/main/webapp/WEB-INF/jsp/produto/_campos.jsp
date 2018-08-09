
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<label for="nome">Descriçao</label>
<input type="text" name="nome" id="nome" value="${produto.nome}">
<form:errors path="produto.nome"/>
<label for="quantidade_unitaria">Quantidade</label>
<input type="text" name="quantidade_unitaria" id="quantidade_unitaria" value="${produto.quantidade_unitaria}">
<form:errors path="produto.quantidade_unitaria"/>
<label for="preco">Preco</label>
<input type="text" name="preco" id="preco" value="${produto.preco}">
<form:errors path="produto.preco"/>