<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h3>�ֹ�����</h3>
	<table border="1" cellspacing="0">
		<tr>
			<th>��ǰ��</th>
			<th>�ֹ�����</th>
			<th>����</th>
			<th>�����ݾ�</th>
		</tr>
		<tr>
			<td>${order.p.name }</td>
			<td>${order.quantity }</td>
			<td>${order.p.price }</td>
			<td>${order.quantity *  order.p.price}</td>
		</tr>
	</table>
	<form action="${pageContext.request.contextPath }/order/order2"
		method="post">
		������ּ�:<input type="text" name="address"><br> ���� ��� ��ȭ��ȣ:<input
			type="text" name="tel"><br> <input type="hidden"
			name="consumer_id" value="${sessionScope.id }"> <input
			type="hidden" name="pro_num" value="${order.pro_num}"> <input
			type="hidden" name="quantity" value="${order.quantity}"> <input
			type="hidden" name="result" value="1"> <input type="submit"
			value="����">

	</form>
</body>
</html>