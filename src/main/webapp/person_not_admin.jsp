<%--
  Created by IntelliJ IDEA.
  User: Developer
  Date: 9/14/2024
  Time: 10:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Thông Tin Chi Tiết Người Đăng Nhập</title>
</head>
<body>
    <div class="container-fluid text-center">
        <h1>Thông Tin Chi Tiết</h1>
        <div>
            <%= request.getServletContext().getAttribute("account").toString() %>
        </div>
    </div>
</body>
</html>
