<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Login-Contact Application</title>
<link href="static/css/style.css"
rel="stylesheet">
</head>
<!-- <s:url var="url_bg" value="static/images/"></s:url> -->
<body background="static/images/background-wallpaperwebsites-desktop-website-templates-web-1920x1080-wallpaper.jpg">
<!-- <body> -->
<table border="2" width="100%" align="center">
<tr>
<td hight="80px">
<%--Header--%>
<jsp:include page="WEB-INF/view/include/header.jsp"></jsp:include>
</td>
</tr>
<tr>
<td hight="25px">
<%--Menu--%>
<jsp:include page="WEB-INF/view/include/menu.jsp"></jsp:include>
</td>
</tr>
<tr>
<td hight="350px" valign="top">
<%--Page Content Area--%>
<h3>User Login</h3>
<%-- <s:url var="url_login" value="/login/"/> --%>
<!-- shows Error message -->
<c:if test="${err!=null}">
<p class="error">${err}</p>      
</c:if>
<f:form action="/login" ModelAttribute="command"> 
<table border="1">
<tr>
<td>User name</td> 
<%-- <td><f:input path="loginName"/> </td> --%>
<td><input type="text" placeholder="UserName" input path="loginName"></td>
</tr>
<tr>
<td>Password</td>
<td><input type="text" placeholder="Password" password path="password"></td>
<%-- <td><f:input path="password"/> </td> --%>
</tr>
<tr>
<td><button colspan="2" align="right">Submit</button><br>
<a href="#">New User Registration</a>
</td> 
</td>
</tr>
</table>
</f:form>
</td>
</tr>
<tr>
<td hight="25px">
<%--Footer--%>
<jsp:include page="WEB-INF/view/include/footer.jsp"></jsp:include>
</td>
</tr>
</table>
</body>
</html>