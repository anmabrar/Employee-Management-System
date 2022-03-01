<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="shortcut icon" href="#">
<style><%@include file="/WEB-INF/asset/style.css"%></style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<title>EMS | Home</title>
</head>
<body>
    <header>
        <h1>EMS</h1>
        <nav>
            <ul class="navbar">
                <li><a href="#">Home</a></li>
                <li><a href="#">Add Employee</a></li>
                <li><a href="#">All Employee</a></li>
                <li><a href="#">About</a></li>
                <li><a href="#">Contact</a></li>
            </ul>
        </nav>
    </header>

    <div class="employee">
        <h3 id="addEmployee">Add Employee</h3>
        <form  class="employeeFrom" id="form">
            <label for="name">Employee Name:</label> <br>
            <input type="text" id="name" name="name"> <br>
            <label for="email">Email:</label> <br>
            <input type="email" name="email" id="email"> <br>
            <label for="mobile">Mobile Number:</label> <br>
            <input type="text" name="mobile" id="mobile"> <br>
            <input type="submit" value="Submit">
        </form>
    </div>
    
    <div>
    	<h3 class="">Employee List: </h3>
    	<ul id="output">
    		
        </ul>
    </div>

  	<script><%@include file="/WEB-INF/asset/index.js"%></script>
  
</body>
</html>

