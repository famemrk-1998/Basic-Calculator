<%-- 
    Document   : result
    Created on : Oct 28, 2020, 3:28:32 PM
    Author     : Jetnipit Morakot
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Servlet BasicCalculator</title>
    </head>
    <body>
        <%
            String button = request.getParameter("button");
            String result = (String) request.getAttribute("result");
            String number1 = request.getParameter("num1");
            String number2 = request.getParameter("num2");
            
            if (button != null && button.equals("Add") ) {
                out.print("The result of " + number1 + " + " + number2 + " is: " + result);
            }
            else if (button != null && button.equals("Sub") ){
                out.print("The result of " + number1 + " - " + number2 + " is: " + result);
            }
            else if (button != null && button.equals("Mul")){
                out.print("The result of " + number1 + " * " + number2 + " is: " + result);
            }
            else {
                out.print("The result of " + number1 + " / " + number2 + " is: " + result);
            }
            
        %>
    </body>
</html>
