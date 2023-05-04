<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<body>

<h2>  Dear  Employee, WELCOME!</h2>

<br>
<br>
<br>

<%--
Your name: ${param.employeeName}
--%>

Your name: ${employee.name}
<br> <br> <br>

Your surname: ${employee.surname}
<br> <br> <br>

Your salary: ${employee.salary}
<br> <br> <br>

Your phoneNumber: ${employee.phoneNumber}
<br> <br> <br>

Your email: ${employee.email}
<br> <br> <br>

Your department: ${employee.department}
<br> <br> <br>

Your car: ${employee.carBrand}
<br> <br> <br>

Your language(s):
<ul>
    <c:forEach var="lang" items="${employee.languages}">
        <li> ${lang} </li>
    </c:forEach>
</ul>


<br>
<br>
<a href="/spring_course_mvc/employee/"> Back home page </a>

</body>

</html>