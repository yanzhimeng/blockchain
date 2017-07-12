<%@ page language="java" import="java.util.*" contentType="text/html; charset=GB2312" %>
<!DOCTYPE html>
<html>
<head>
    <title>Home</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <script type="text/javascript" src="/static/js/jquery-1.11.3.js" charset="utf-8"></script>
    <script type="text/javascript" src="/static/js/exchange.js" charset="utf-8"></script>
</head>
<body>
<div>
    <h2><a>Hello BitCoin!</a></h2>
</div>
<div>
    <form action="/exchange/detail" method="post">
        <select id=s1 onchange="show()" name="s1" style="height: 23px;width: 80px">
            <option value="AAA" selected="selected">AAA</option>
            <option value="BBB">BBB</option>
            <option value="CCC">CCC</option>
        </select>
        <select id=s2 name="s2" style="height: 23px;width: 80px">
            <option selected="selected">aaa1</option>
            <option>aaa2</option>
            <option>aaa3</option>
        </select>
        <input type="submit" name="²éÑ¯">
    </form>
</div>
</body>
</html>