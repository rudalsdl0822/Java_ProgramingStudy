<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script>
	var sel1=0; //������ �� ������ ���� ��з�
	var sel2=0; //������ �� ������ ���� �Һз�
	$(document).ready(
			function() {
				$.post("/admin/getsub", {
					type : 1,// ��з� ��ȣ 
					p_id : 0 // 
				}).done(
						function(data) {
							var c = eval("(" + data + ")");
							for (i = 0; i < c.length; i++) {
								$("#s1").append(
										"<option value='"+c[i].id+"'>"
												+ c[i].name + "</option>"); //��з� ���� �޾ƿͼ� �߰��ϰ� 
							}
						});
				
				$("#s1").click(function() {
					var x = 0;
					x = this.options[this.options.selectedIndex].value
					sel1 = x;
					$.post("/admin/getsub", {
						type : 2,
						p_id : x // ���ܰ� ��з� 
					}).done(function(data) {
						var c = eval("(" + data + ")");
						$("#s2").empty();//�ʱ�ȭ�� �Ϸ��� ���� 
						$("#s3").empty(); //�ʱ�ȭ�� �Ϸ��� ����
						for (i = 0; i < c.length; i++) {
							$("#s2").append("<option value='"+c[i].id+"'>"//�߰��ϰ� 
									+ c[i].name + "</option>");
						}
					});
				});
				
				$("#s2").click(function() {
					var x = 0;
					x = this.options[this.options.selectedIndex].value
					sel2=x;
					$.post("/admin/getsub", {
						type : 3,
						p_id : x // �ߺз� �θ� 
					}).done(function(data) {
						var c = eval("(" + data + ")");
						$("#s3").empty();//�ʱ�ȭ�� �Ϸ��� ����
						for (i = 0; i < c.length; i++) {
							$("#s3").append("<option value='"+c[i].id+"'>"//�߰��ϰ� 
									+ c[i].name + "</option>");
						}
					});
				});

				$("input[type=button]").click(function() {		
					if(this.form.elements[0].name=='s2'){//�ߺ�� ��ư�� ������ �� sel1�� ���� 
						this.form.p_id.value=sel1;
					}else if(this.form.elements[0].name=='s3'){//�Һз� ��ư�� ������ �� sel2 ���� ���� 
						this.form.p_id.value=sel2;
					}
					var o = this.form.elements[0].options;
					for(i=0;i<o.length;i++){						
						if(o[i].text==this.form.name.value){
							alert("�̹� �ִ� ī�װ��Դϴ�.");
							return;
						}
					}
					this.form.submit();
				});
			});
</script>
</head>
<body>
	<h3>������</h3>
	��з�:
	<form id="f1"action="${pageContext.request.contextPath }
	/admin/addCategory" onsubmit="return false" method="post">
		<select id="s1" name="s1"></select> 
		<input type="text" id="n1" name="name">
		<input type="hidden" name="type" value="1">
		<input type="button" id="b1" value="�߰�">
	</form>
	<br>	
	�ߺз�:	
	<form id="f2" action="${pageContext.request.contextPath }
	/admin/addCategory" onsubmit="return false"  method="post">
		<select id="s2"  name="s2"></select> 
		<input type="text" id="n2" name="name">
		<input type="hidden" name="type" value="2">
		<input type="hidden" id="h1" name="p_id" value="">
		<input type="button" id="b2" value="�߰�">
	</form>
	<br>	
	�Һз�:
	<form id="f3" action="${pageContext.request.contextPath }
	/admin/addCategory?type=3" onsubmit="return false"  method="post">
		<select id="s3"  name="s3"></select> 
		<input type="text" id="n3" name="name">
		<input type="hidden" name="type" value="3">
		<input type="hidden" id="h2" name="p_id" value="">
		<input type="button" id="b3" value="�߰�">
	</form>
</body>
</html>