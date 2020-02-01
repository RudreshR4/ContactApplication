<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User DashBoard-Contact Application</title>
<link href="static/css/style.css"
rel="stylesheet">
</head>
<!-- <s:url var="url_bg" value="static/images/"></s:url> -->
<body background="static/images/background-wallpaperwebsites-desktop-website-templates-web-1920x1080-wallpaper.jpg">
<body>
<table border="2" width="100%" align="center">
<tr>
<td hight="80px">
<%--Header--%>
<jsp:include page="/WEB-INF/view/include/header.jsp"></jsp:include>
</td>
</tr>
<tr>
<td hight="25px">
<%--Menu--%>
<jsp:include page="/WEB-INF/view/include/menu.jsp"></jsp:include>
</td>
</tr>
<tr>
<td hight="350px" valign="top">
<%--Page Content Area--%>
<h1>User DashBoard</h1>
<!-- TODO: user options in this page. -->
</td>
</tr>
<tr>
<td hight="25px">
<%--Footer--%>
<jsp:include page="/WEB-INF/view/include/footer.jsp"></jsp:include>
</td>
</tr>
</table>
</body>
</html>