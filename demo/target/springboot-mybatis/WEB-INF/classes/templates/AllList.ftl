<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>用户列表页</title>
    <style>
        h2{
            text-shadow: 5px 5px 5px #3effe0;
        }
        tr td{
            text-align: center;
        }
    </style>
    <script>
        function del (perId) {
          window.location.href="/delete?perId="+perId;
        }
        function update(perId) {
            window.location.href="queryById?perId="+perId;
        }
    </script>
</head>
<body>
    <center>
        <h2>用户信息列表</h2><hr/>
        <button type="button" onclick="location.href='/add'">新增</button>
        <table width="400px">
            <tr>
                <td>id</td>
                <td>name</td>
                <td>age</td>
                <td>pwd</td>
                <td>sex</td>
                <td>操作</td>
            </tr>
            <#if personList??>
                <#list personList as item>
                  <tr>
                      <td>${item.perId}</td>
                      <td>${item.perName}</td>
                      <td>${item.perAge}</td>
                      <td>${item.perPwd}</td>
                      <td>${item.perSex}</td>
                      <td><button onclick="del(${item.perId})">删除</button>
                          <button onclick="update(${item.perId})">修改</button>
                      </td>
                  </tr>
                </#list>
            </#if>
        </table>
    </center>

</body>
</html>