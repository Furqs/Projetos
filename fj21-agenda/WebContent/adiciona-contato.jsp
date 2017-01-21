<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="caelum" %>

<link href="css/jquery.css" rel="stylesheet">
<script src="js/jquery.js"></script>
<script src="js/jquery-ui.js"></script>
	
<title>Insert title here</title>
</head>

<body>
<c:import url="cabecalho.jsp"/>
	<h1>Adiciona Contato</h1>
	<hr />
	<form action="adicionaContato">
		Nome: <input type="text" name="nome"/><br/>
		E-mail: <input type="text" name="email"/><br/>
		Endere�o: <input type="text" name="endereco"/><br/>
		Data Nascimento: <caelum:campoData id="dataNascimento"/> <br/>
		<input type="submit" name="Gravar"/>
	</form>
<c:import url="rodape.jsp"/>
</body>
</html>