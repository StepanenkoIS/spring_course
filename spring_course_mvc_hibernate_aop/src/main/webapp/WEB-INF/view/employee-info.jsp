<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<body>


<h2>Employee Info</h2>

<br>

<form:form action="saveEmployee" modelAttribute="employee">

    Name<form:input path="name"/>
    <br> <br> <br>
    Surname<form:input path="surname"/>
    <br> <br> <br>
    Department<form:input path="department"/>
    <br> <br> <br>
    Salary<form:input path="salary"/>
    <br> <br> <br>

    <input type="submit" value="Ok"/>
</form:form>
</body>
</html>
