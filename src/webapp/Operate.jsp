<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<%--表格--%>
<table border="1">
    <tr>
        <th>用户名称</th>
        <th>密码</th>
        <th>操作</th>
    </tr>
    <c:forEach  items="${userList}"  var="userItem" varStatus="userStatus">
        <tr>
            <td>
                <c:out value=""/>
            </td>
            <td>
                <c:out value=""/>
            </td>
            <td>
                <c:out value=""/>
            </td>
        </tr>

    </c:forEach>

</table>
</body>
</html>
