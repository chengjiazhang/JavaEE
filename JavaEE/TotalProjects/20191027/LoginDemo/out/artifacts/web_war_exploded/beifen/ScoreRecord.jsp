<%@ page import="java.util.List" %>
<%@ page import="java.util.Vector" %>
<%--
  Created by IntelliJ IDEA.
  User: edz
  Date: 2019-10-28
  Time: 13:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr>
        <th>序号</th>
        <th>姓名</th>
        <th>扣分情况</th>
        <th>剩余分数</th>
        <th>原来分数</th>
        <th>联系电话</th>
        <th>扣分时间</th>
    </tr>

    <%
        Vector v = (Vector) request.getAttribute("vector");
        List list = (List) request.getAttribute("list");
        int i;
        int j;

        for (i = 0; i < v.size(); i++) {
    %>
    <tr>
        <%
            Vector v1 = (Vector) v.get(i);
            for (j = 0; j < v1.size(); j++) {
                if (j == 4) {
                    out.write(1);
                    int obj = (int) request.getAttribute("score");

                    System.out.println("jsp===");
                    System.out.println("jsp===");
        %>
        <td><%=(Integer.valueOf((String) v1.get(3)) - obj)%>
        </td>
        <td><%=list.get(4)%>
        </td>
        <%
            }

        %>

        <td><%=v1.get(j)%>
        </td>

        <%
            }%>
        <%


        %>
    </tr>
    <%
        }
    %>
</table>
</body>
</html>
