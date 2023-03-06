<%--
  Created by IntelliJ IDEA.
  User: 戴国亮Uncle
  Date: 2023/1/25
  Time: 23:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="footer">
    <div class="main">
        <div class="footerR" style="margin: 0 auto; float: none">
            <div class="fnav">
                <a href="<%= ServletUtils.getProjectHttpUrl(request)%>web/system/toWebPage/index/0">首页</a>
                <a href="<%= ServletUtils.getProjectHttpUrl(request)%>web/system/toWebPage/piclist/1">景区景点</a>
                <a href="<%= ServletUtils.getProjectHttpUrl(request)%>web/system/toWebPage/list/2">旅行攻略</a>
                <c:if test="${sessionScope.webUser != null}">
                <a href="<%= ServletUtils.getProjectHttpUrl(request)%>web/system/toWebPage/member/3">个人中心</a>
                </c:if>
                <a href="<%= ServletUtils.getProjectHttpUrl(request)%>system/toAdminLoginPage">网站后台</a>
            </div>
            <div class="fcon">
                <div>仙踪派  地址：广东省广州市<br />联系人：戴国亮  电话：13640903137  邮箱：13640903137@qq.com  QQ：13640903137</div>
            </div>
        </div>
        <div class="clear"></div>
    </div>
</div>
</body>
</html>
