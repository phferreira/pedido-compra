
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<label for="nome">Nome</label>
<input type="text" name="nome" id="nome" value="${fornecedor.nome}">
<form:errors path="pessoa.nome"/>