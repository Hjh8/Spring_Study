<%@page contentType="text/html;charset=utf-8" pageEncoding="utf-8" %>
<html>
<body>
    <h2>学生注册</h2>
    <form action="reg" method="post">
        <tr>
            <td>id：</td>
            <td><input type="text" name="id"></td>
        </tr><br>
        <tr>
            <td>姓名：</td>
            <td><input type="text" name="name"></td>
        </tr><br>
        <tr>
            <td>年龄：</td>
            <td><input type="text" name="age"></td>
        </tr><br>
        <tr>
            <td>邮箱：</td>
            <td><input type="text" name="email"></td>
        </tr><br>
        <tr>
            <td><input type="submit" value="提交"></td>
        </tr><br>
    </form>
</body>
</html>
