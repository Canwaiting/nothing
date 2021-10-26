<%--
  Created by IntelliJ IDEA.
  User: canwaiting
  Date: 2021/10/26
  Time: 下午4:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="dao.*"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    UseDao useDao = new UseDao();
    useDao.login("root","12345");
%>

</body>
</html>
