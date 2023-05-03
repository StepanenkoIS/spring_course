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

<%--    Department <form:select path="department">--%>
<%--    <form:option value="Information Technology" label="IT"/>--%>
<%--    <form:option value="Human Resources" label="HR"/>--%>
<%--    <form:option value="Sales" label="Sales"/>--%>
<%--    </form:select>--%>

    Department <form:select path="department">
    <form:options items="${employee.departments}"/>
</form:select>
    <br> <br> <br>

<%--    Which car do you want?--%>
<%--    <br>--%>
<%--    Niva <form:radiobutton path="carBrand" value="Niva"/>--%>
<%--    <br>--%>
<%--    Lada Vesta <form:radiobutton path="carBrand" value="Lada Vesta"/>--%>
<%--    <br>--%>
<%--    Moskvitch 3 <form:radiobutton path="carBrand" value="Moskvitch 3"/>--%>
<%--    <br>--%>


<%--    Which car do you want?--%>
<%--    <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>--%>
<%--    <br> <br> <br>--%>
<%--    Foreign Languages(s)--%>
<%--    EN <form:checkbox path="languages" value="English"/>--%>
<%--    DE <form:checkbox path="languages" value="Deutch"/>--%>
<%--    FR <form:checkbox path="languages" value="French"/>--%>


    Which car do you want?
    <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
    <br> <br> <br>
    Foreign Languages(s)
    <form:checkboxes path="languages" items="${employee.languageList}"/>

    <br> <br> <br>

    <input type="submit" value="OK">

</form:form>
















<br>
<br>
<a href="/spring_course_mvc/employee/"> Back home page </a>

</body>

</html>