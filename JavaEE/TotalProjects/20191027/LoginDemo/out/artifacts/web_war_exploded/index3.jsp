<%@ page import="javafx.scene.shape.Circle" %><%--
  Created by IntelliJ IDEA.
  User: edz
  Date: 2019-11-03
  Time: 10:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%!
    private int initCounter = 0;
    private int serviceCounter = 0;
    private int destroyCounter = 0;
%>

<%!
    public void jspInit() {
        System.out.println("初始化加载===initCounter" + initCounter);
    }

    int i = 0;
%>
<%!
int d
        ,
        b
        ,
        c;
    int day = 3;
%>
<%!
    Circle a = new Circle(2.0);
%>

<%!
    public void jspDestroy() {
        System.out.println("destroy====" + destroyCounter);
    }
%>
<%
    out.println("你的ip地址是：" + request.getRemoteAddr() + "=====Cirlce:" + a);
%>
<br>

<%
    out.println("%/>");
%>

<p>

    今天的日期是：<%=(new java.util.Date()).toLocaleString()%>
    ip地址：<%=request.getRemoteAddr()%>
</p>
<br>
<%
    if (day == 6 || day == 7) {
        out.println("今天是周末");
    } else {
        out.println("今天不是周末");
    }
%>
<br>
<%
    switch (day) {
        case 1:
            out.println("周一");
            break;
        case 2:
            out.println("周二");
            break;
        case 3:
            out.println("周三");
            break;
        case 4:
            out.println("周四");
            break;
        case 5:
            out.println("周五");
            break;
        case 6:
            out.println("周六");
            break;
        case 7:
            out.println("周日");
            break;
        default:
            out.println("没有此时间");
    }
%>
<br>
<%!
    int sum = 0;%>
<%
    for (int i = 1; i <= 100; i++) {
        sum += i;
        if (i == 100) {
            out.println("JAVA：");
        }
    }
    out.println(sum);
%>
</body>
</html>
