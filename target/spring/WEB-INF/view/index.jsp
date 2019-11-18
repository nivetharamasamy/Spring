<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.sql.*;"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>W3.CSS</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">

</head>
<body>
        
    <br>
<br>
<center><h3>Lodetails in table format</h3></center>
<br>
<center> <a href="/newlogpage">add new</a></center>
<br>
<div class="w3-container">
        
<table class="w3-table-all" id="logindetails" border="1" cellpadding="5" align="center">
<tr>
    <th>Username</th>
    <th>Email</th>
    <th>password</th>
    <th>Phone number</th>
    <th>City</th>
    <th>Edit</th>
    <th>Delete</th>

   
</tr>
 
<c:forEach var="li" items="${listm}">
        <tr class="w3-hover-blue">
                <td><c:out value="${li.username}" /></td> 
                <td><c:out value="${li.email}" /></td> 
                <td><c:out value="${li.password}" /></td> 
                <td><c:out value="${li.phonenumber}" /></td>   
                <td><c:out value="${li.city}" /></td>  
                <td><c:out value="${li.gender}"/></td>
                <td>
            <a href="/edit?id=${li.username}">Edit</a></td>
           
            <td> <a href="/delete?id=${li.username}">Delete</a> </td>                    
         
             
            </tr>
        </c:forEach>
        </table> 
    </div>    
        </body>
        </html>