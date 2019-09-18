<%-- 
    Document   : index
    Created on : Mar 26, 2019, 10:35:55 PM
    Author     : spark
--%>


<%@page import="java.io.InputStreamReader"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.net.URLConnection"%>
<%@page import="java.net.URL"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>


<%
URL oracle = new URL("https://jsonplaceholder.typicode.com/posts/1");
String inputLine="";
try {
URLConnection yc = oracle.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(
                                yc.getInputStream()));
        
        while (in.ready()) 
           inputLine += in.readLine();
        in.close();
        
        
        
        
    
    
} catch (Exception e) {
e.printStackTrace();
}

%>








<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <p><%= inputLine %></p>
        
        <div>
  <input style="width: 50%" type="range" min="1" max="5" value="3">
</div>

<table style="width:100%">
  <tr>
    <th>UserID</th>
    <th>ID</th> 
    <th>Title</th>
    <th>Body</th>
  </tr>
  <tr>
    <td>Jill</td>
    <td>Smith</td>
    <td>50</td>
    <td>ajdlasjldjlajdlaj</td>
  </tr>
  <tr>
    <td>Eve</td>
    <td>Jackson</td>
    <td>94</td>
  </tr>
  <tr>
    <td>John</td>
    <td>Doe</td>
    <td>80</td>
  </tr>
</table>
        
        
        
        
        
        
        
        
        
    </body>
</html>
