<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=utf-8"%>
<html xmlns:c="http://www.w3.org/1999/XSL/Transform">
<head>
    <title>登录</title>
</head>
<body>
<c:if test="${!empty error}">
    <c:out value="${error}"/>
</c:if>
<form action="<c:url value='/view/loginCheck'/>" method="post">
    用户名：
    <input type="text" name="userName">
    <br>
    密 码：
    <input type="password" name="password">
    <br>
    <input type="submit" value="登录"/>
</form>
</body>
</html>