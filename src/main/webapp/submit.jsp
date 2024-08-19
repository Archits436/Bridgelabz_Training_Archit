<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form Submission Result</title>
</head>
<body>
    <h2>Thank You!</h2>
    <p>Thank you, <%= request.getParameter("name") %>!</p>
    <p>Your email address <%= request.getParameter("email") %> has been recorded.</p>
</body>
</html>
