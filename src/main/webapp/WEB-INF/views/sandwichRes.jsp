<%--
  Created by IntelliJ IDEA.
  User: z
  Date: 12/14/2021
  Time: 9:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach var="res" items="${condiment}">
    ${res}
</c:forEach>
</body>
</html>
