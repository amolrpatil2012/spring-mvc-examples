<%--
  Created by IntelliJ IDEA.
  User: Amol
  Date: 05-07-2023
  Time: 18:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
<c:forEach items="${students}" var="s">
    <tr>
        <td> ${s.roll} </td>
        <td> ${s.name} </td>

    </tr>

</c:forEach>
</table>
</body>
</html>
