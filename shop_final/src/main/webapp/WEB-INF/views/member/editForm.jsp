<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h3>�� ���� ����</h3>
<form action="${pageContext.request.contextPath }/member/edit"
method="post">
id:<input type="text" name="id" value="${m.id }" readonly><br/>
pwd:<input type="text" name="pwd" value="${m.pwd }" ><br/>
name:<input type="text" name="name" value="${m.name }" ><br/>
tel:<input type="text" name="tel" value="${m.tel }" ><br/>
address:<input type="text" name="address" value="${m.address }" ><br/>
type:
<c:choose>
	<c:when test="${m.type==1 }">������</c:when>
	<c:when test="${m.type==2 }">�Ǹ���</c:when>
	<c:when test="${m.type==3 }">������</c:when>
	<c:otherwise>�߸��� type</c:otherwise>
</c:choose>
<br>
<input type="reset" value="���"/>
<input type="submit" value="����"/>
</form>
</body>
</html>