<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Bem vindo ao Inferno</title>
</head>
<body>
<%--Comentario em JSP aqui: nossa primeira pagina Jsp --%>
<% String mensagem = "Bem vindo ao inferno FJ-21";
	out.println(mensagem);
%>
<br/>
<% String desenvolvido = "desenvolvido por Lucifer"; %><%=desenvolvido %>
<br/>

</body>
</html>