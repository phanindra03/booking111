<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>
<body>



		<c:if test="${hotelList ne null}">
		<h3> WELCOME TO TREEBO</h3>
			<table>
				  <tr>
				  <th>ID</th>
				  <th>NAME</th>
				  <th>Rating</th>
				  <th>Rate</th>
				  <th>Available Rooms</th>
				</tr>
				<c:forEach items="${hotelList}" var="hotel">
					<tr>
						<th> ${hotel.id} </th>
						<th><a href="save.html?uid=${hotel.name}">${hotel.name}</a></th>
						<th>  ${hotel.rating}</th>
						<th>  ${hotel.rate}</th>
						<th>  ${hotel.number}</th>
						
					</tr>
				</c:forEach>
			</table>
		</c:if>
		

</body>
</html>