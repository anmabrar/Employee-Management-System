<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style><%@include file="/WEB-INF/asset/style.css"%></style>
<title>EMS | Home</title>
</head>
<body>
    <header>
        <h1>EMS</h1>
        <nav>
            <ul>
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
        <form class="employeeFrom">
            <label for="Ename">Employee Name:</label> <br>
            <input type="text" id="Ename" name="Ename"> <br>
            <label for="email">Email:</label> <br>
            <input type="email" name="email" id="email"> <br>
            <label for="mobile">Mobile Number:</label> <br>
            <input type="text" name="number" id="number"> <br>
            <input type="submit" value="Submit">
        </form>
    </div>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="index.js"></script>
</body>
</html>

