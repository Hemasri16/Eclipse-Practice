<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript"
	src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script type="text/javascript">
	$(document).ready(
			function() {
		$("#slno").change(function(event) {
			var slno = $(this).children("option:selected").val();
			$.get("GetName.jsp?slno="+slno,function(result) {
				alert("Result : " + $.trim(result))

			});
		});
	});
</script>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
	<h2>Welcome to Ajax</h2>
	Sl.No:
	<select name="slno" id="slno">
		<option value="0">---Select---</option>
		<option value="101">101</option>
		<option value="102">102</option>
		<option value="103">103</option>
		<option value="104">104</option>
		<option value="105">105</option>
		<option value="106">106</option>

	</select>
	<br>
	<br> Name:
	<input type="text" name="name" id="name" readonly>

</body>
</html>