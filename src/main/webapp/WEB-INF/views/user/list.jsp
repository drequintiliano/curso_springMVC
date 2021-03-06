<%@ page language="java" contentType="text/html, charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista de Usuarios</title>
</head>

<body>
	<div class="container">
		<h1>Lista de Usuários</h1>
		<hr>
		<div>
			<a class="btn-btn-default" href="#">Novo Usuário</a>
		</div>
		<hr>
		<div class="panel-default">

			<div class="panel-heading">
				<span>${message == null ? '&nbsp' : message}</span>
			</div>

			<table class="table table-striped table-condensed">
				<thead>
					<tr>
						<th>ID</th>
						<th>NOME</th>
						<th>ACAO</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="usuario" items="${usuarios }">
						<tr>
							<td>${usuario.id }</td>
							<td>${usuario.nome }${usuario.sobrenome }</td>
							<td><a class="btn btn-info" href="#">Editar</a> <a
								class="btn btn-danger" href="#">Excluir</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<hr>
		<footer class="footer"> 
			<p>&copy; 2019 Segura a onda </p>
		</footer>
	</div>
</body>

</html>