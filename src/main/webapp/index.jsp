<%--
  Created by IntelliJ IDEA.
  User: Developer
  Date: 9/14/2024
  Time: 10:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Đăng Nhập Tài Khoản</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</head>
<body>
    <div class="container-fluid">
        <form action="control-servlet" method="post" class="container-fluid text-center">
            <div class="text-center">
                <h1>Đăng Nhập Tài Khoản</h1>
            </div>
            <div class="container-fluid d-flex">
                <label class="form-label col-4" for="email">Email:</label>
                <input class="form-control col-8" type="text" id="email" name="email" placeholder="Nhập email" required>
            </div>
            <div class="container-fluid d-flex">
                <label class="form-label col-4" for="password">Mật Khẩu</label>
                <input class="form-control col-8" type="password" id="password" name="password" placeholder="Nhập mật khẩu" required>
            </div>
            <div class="container-fluid d-flex">
                <button type="submit" class="btn btn-primary text-center">Đăng Nhập</button>
            </div>
            <input type="hidden" name="action" value="LogIn"/>
        </form>
    </div>
</body>
</html>
