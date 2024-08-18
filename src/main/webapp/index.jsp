<%@ page import="java.util.ArrayList, java.util.Arrays" %>
<html>
<body>
<h2>Hello World!</h2>
<%
    ArrayList<String> Products = new ArrayList<>(Arrays.asList("laptop", "mobile", "bags", "t-shirt", "jeans"));
    for(int i = 0; i < Products.size(); i++){
        out.print(Products.get(i) + "     ");
    }
%>
</body>
</html>
