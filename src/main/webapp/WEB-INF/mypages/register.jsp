<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
</head>
<body>
<h2>registration</h2>


<form class=action="/registerUser" method="POST" >
	<input class="form-control" type ="text" name="uName"></input>
	<input class="form-control" type="password" name="pwd"></input>
	<button class ="btn-btn-success" type ="submit">Register </button>
</form>
</body>
</html>