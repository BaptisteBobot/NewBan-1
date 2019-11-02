<%--
  Created by IntelliJ IDEA.
  User: shadownluffy
  Date: 28/10/2019
  Time: 13:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="structures/header.jsp"%>
<%
    Cookie[] cookies = request.getCookies();
    if (cookies != null) {
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("prenom")) {
                request.setAttribute("prenom", cookie.getValue());
            }
        }
    }
%>
<%String prenom = "";%>
<% if (request.getAttribute("prenom") != null) {
    prenom = (String) request.getAttribute("prenom");
}%>

<h1 class="mb-lg-5 text-center mt-lg-5">BIENVENUE</h1>

<p>Mon cher <%=prenom%></p>

<%@include file="structures/footer.jsp"%>
