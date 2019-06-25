<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>start page</title>
</head>
<body>
<spring:form method="get" modelAttribute = "modelAP" action="result">
  <spring:input path = "leaderCode" type="search" placeholder="Введите номер запчасти"/>
  <spring:button type = "submit"> Найти </spring:button>
</spring:form>
</body>
</html>