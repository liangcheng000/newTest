<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>update</title>
    <style>
        h2{
            text-shadow: 5px 5px 5px #3effe0;
        }
        tr td{
            text-align: center;
        }
    </style>
</head>
<body>
<center>
    <h2>修改</h2><hr/>
    <form action="/update" method="post">
    <table>
        <tr>
            <td>ID</td>
            <td><input name="perId" type="text" value="${persons.perId}"/></td>
        </tr>
        <tr>
        <td>姓名:</td>
        <td><input name="perName" type="text" value="${persons.perName}"></td>
        </tr>
        <tr>
            <td>密码:</td>
            <td><input name="perPwd" type="text" value="${persons.perPwd}"></td>
        </tr>
        <tr>
            <td>性别:</td>
            <td><select name="perSex">
                <option value="男">男</option>
                <option value="女">女</option>
            </select>
            </td>
        </tr>
        <tr>
            <td>年龄:</td>
            <td><input name="perAge" type="text" value="${persons.perAge}"></td>
        </tr>
    </table>
        <button type="submit">提交</button>
    </form>
    <button type="button" onclick="location.href='/queryAll'">返回列表页面</button>
</center>
</body>
</html>