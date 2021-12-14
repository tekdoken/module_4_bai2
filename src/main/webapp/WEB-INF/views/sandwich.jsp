<%--
  Created by IntelliJ IDEA.
  User: z
  Date: 12/14/2021
  Time: 9:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sandwich</title>
</head>
<body>
<h1>Sandwich Condiments</h1>

<form action="/save" method="post">
    <input name="condiment" type="checkbox" value="Lettuce">Lettuce <input name="condiment" type="checkbox" value="Tomato">Tomato <input name="condiment" type="checkbox" value="Mustard">Mustard <input
        name="condiment"  type="checkbox" value="Sprouts">Sprouts
    <button>
        save
    </button>
</form>
</body>
</html>
