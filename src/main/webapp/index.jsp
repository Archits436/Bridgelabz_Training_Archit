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