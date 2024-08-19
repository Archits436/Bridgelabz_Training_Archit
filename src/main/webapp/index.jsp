<!-- 1st program ArrayList

<%@ page import="java.util.ArrayList, java.util.Arrays" %>
<html>
<body>
<h2>Hello World!</h2>
<%
    ArrayList<String> Products = new ArrayList<>(Arrays.asList("laptop", "mobile", "bag", "tshirt", "jeans"));
    for(int i = 0; i < Products.size(); i++){
        out.print(Products.get(i) + "     ");
    }
%>
</body>
</html>
-->

<!-- 2nd Program Day and Time

<%@ page import="java.util.Date, java.text.SimpleDateFormat" %>
<html>
<body>
<h2>Current Date and Time</h2>
<%
    Date now = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
    String formattedDate = formatter.format(now);
%>
<p>The current date and time is: <%= formattedDate %></p>
</body>
</html>
-->

<!-- 3rd Program Conditional

<html>
<body>
<h2>Conditional Rendering</h2>
<%! boolean isLoggedIn=true;%>
<% if(isLoggedIn){
        out.println("Welcome to this page");
    }
    else{
        out.println("please log in");
    }
%>
</body>
</html>
-->

<!-- 4th program employee table

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.ArrayList, java.util.List, com.example.model.Employee" %>
<html>
<head>
    <title>Employee List</title>
</head>
<body>
    <h2>Employee List</h2>
    <%
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John Doe", "HR"));
        employees.add(new Employee("Jane Smith", "Finance"));
        employees.add(new Employee("Mike Johnson", "IT"));

        request.setAttribute("employeeList", employees);
    %>
    <table border="1">
        <tr>
            <th>Name</th>
            <th>Department</th>
        </tr>
        <%
             List<Employee> employeeList = (List<Employee>) request.getAttribute("employeeList");
             for (Employee employee : employeeList) {
        %>
                 <tr>
                    <td><%= employee.getName() %></td>
                    <td><%= employee.getDepartment() %></td>
                 </tr>
           <%
             }
            %>
    </table>
</body>
</html>
-->

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form Submission</title>
</head>
<body>
    <h2>Enter Your Details</h2>
    <form action="submit.jsp" method="post">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required><br><br>
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required><br><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>

