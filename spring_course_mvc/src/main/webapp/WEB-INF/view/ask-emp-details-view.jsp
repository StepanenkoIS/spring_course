<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<body>

<h2> Dear  Employee, please enter your details </h2>

<br>
<br>
<br>

<form:form action="showDetails" modelAttribute="employee">
    Name <form:input path="name"/>
    <br> <br> <br>

    Surname <form:input path="surname"/>
    <br> <br> <br>

    Salary <form:input path="salary"/>
    <br> <br> <br>

    <input type="submit" value="OK">

</form:form>
















<br>
<br>
<a href="/spring_course_mvc/employee/"> Back home page </a>

</body>

</html>