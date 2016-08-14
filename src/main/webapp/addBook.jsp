<%--
  Created by IntelliJ IDEA.
  User: LeeYuan
  Date: 2016/8/14
  Time: 10:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>添加图书</title>
</head>
<body>
    <h1>添加图书</h1>
    <s:form action="book_add" namespace="/" method="post" >
        图书名称：<s:textfield name="name" /><br/>
        图书价格: <s:textfield name="price"/><br/>
        <s:submit value="添加图书"/>
    </s:form>
</body>
</html>
