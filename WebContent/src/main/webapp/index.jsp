<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset=UTF-8">

<title>Internationalization</title>
<c:set var="theLocale" value="${not empty param.theLocale ? param.theLocale : pageContext.request.locale }"/>

<!-- param.theLocale - Read the Locale param sent by Link -->
<!-- pageContent.request.locale - Read the Locale sent by browser HTTP request -->

<fmt:setLocale value="${theLocale}"/>
<fmt:setBundle basename="com.app.jsp.WebContent.i18n.resources.mylabels"/>

</head>
<body>
<a href="index.jsp?theLocale=en_US">English(US)</a>
|
<a href="index.jsp?theLocale=es_ES">Spanish(ES)</a>
|
<a href="index.jsp?theLocale=de_DE">German(DE)</a>
|
<a href="index.jsp?theLocale=hi_IN">Hindi(IN)</a>

<hr>

<fmt:message key="label.greeting"/><br><br>
<fmt:message key="label.firstname"/><i> Pranav</i><br><br>
<fmt:message key="label.lastname"/><i> Keshware</i><br><br>
<fmt:message key="label.welcome"/><br><br>

<hr>
Selected Locale: ${theLocale}
</body>
</html>