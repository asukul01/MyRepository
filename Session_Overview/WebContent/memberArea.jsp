<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Member Area</title>
</head>
<body>
	<!--<
	String userName = null, sessionId = null;
	Cookie[] cookies = request.getCookies();

	if (cookies != null) {
		for (Cookie cookie : cookies) {
			if (cookie.getName().equals("userName")) {
		userName = cookie.getValue();
			}
			if (cookie.getName().equals("JSESSIONID")) {
		sessionId = cookie.getValue();
			}
		}
	}
	if (sessionId == null || userName == null) {
		response.sendRedirect("login.jsp");
	}
	%>   -->
	
	<%
	String userName = null, sessionId = null;
	if(request.getSession().getAttribute("userName") == null){
		//response.sendRedirect("login.jsp");
		response.sendRedirect(request.getContextPath()+"/SiteController?action=login");
	}else{
		userName = request.getSession().getAttribute("userName").toString();
		sessionId = request.getSession().getId();
	}
	%>

	UserName :
	<%=userName%></br> Current session :<%=sessionId%>

	<form action="<%=request.getContextPath()%>/memberAreaController">
		<input type="hidden" name="action" value="destroy" method="get">
		<input type="submit" value="logOut">
	</form>
</body>
</html>