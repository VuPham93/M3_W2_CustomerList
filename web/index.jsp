<%--
  Created by IntelliJ IDEA.
  User: hurah
  Date: 6/15/2020
  Time: 5:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>Customers</title>
  </head>
  <style>
    table, th, td{
      border: 1px solid black;
      border-collapse: collapse;
      text-align: center;
      padding-left: 20px;
      padding-right: 20px;
    }
    img{
      width: 100px;
      height: 100px;
    }
  </style>
  <body>
  <h1>CUSTOMERS LIST</h1>
  <table>
    <tr>
      <td>Name</td>
      <td>Date of birth</td>
      <td>Address</td>
      <td>Image</td>
    </tr>
      <c:forEach items="${requestScope.customers}" var="customer">
        <tr>
          <td>${customer.name}</td>
          <td>${customer.dateOfBirth}</td>
          <td>${customer.address}</td>
          <td><img src="${customer.picture}"></td>
        </tr>
      </c:forEach>
  </table>
  </body>
</html>
