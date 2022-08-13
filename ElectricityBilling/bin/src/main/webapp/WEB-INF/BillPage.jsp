<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>

<html>
	<head>
		<title>Billing Page</title>
		
		<style>
			body{
				background-color:#d3d3d3;
			}
			
			td{
				text-align:center;
				font-size:20px;
				padding:10px 20px 10px 20px;
				font-weight:500;
				color:blue;
				font-weight:600;
			}
			th{
				font-size:25px;
				padding:10px 20px 10px 20px;
				
			}
			
			#thank{
				color:#ff00ff;
				font-size:23px;
			}
			
			h1{
				text-align:center;
				background-color:#c3447a;
				color:cyan;
				font-size:50px;
				padding: 0.8% 0 1.2% 0;
				border-radius:25px;
				margin:10px 5px 5px 5px;
			}
			
			h3{
				color:red;
				background-color:yellow;
				padding-top:2px;
				padding-bottom:2px;
				padding-left:5px;
				padding-right:5px;
				border-radius:5px;
			}
			
			#link{
				color:blue;
				text-align:center;
				margin-left:40%;
				margin-right:40%;
			}
			
			#note{
				margin:15px 5px 5px 5px;
			}
			
			h2{
				background-color:cyan;
				color:blue;
				text-align:center;
				width:50%;
				margin-left:25%;
				margin-right:25%;
				padding-top:5px;
				padding-bottom:5px;
				border-radius:20px;
			}
			
			table{
				background-color:white;
				border-radius:20px;
			}
			
			span{
				color:red;
			}
		</style>
	</head>	
		
	<body>
		<h1>Welcome to Electricity Billing System</h1>
		
		<h3 id="note"><marquee>Note: The Bill generated by the Electricity Dept. is final and Valid. This is just a simulation program to give you an estimate 
		about the Electricity bill. This bill was generated as per the Slab rates of Andhrapradesh Energy Department, 
		which are last modified in the year of 2022 March.</marquee></h3>
		
		<h2>Type : <span>${bil.getType()}</span> &emsp; &emsp; &emsp; Total Units : <span>${bil.getKwh()}</span></h2>
		
		<table align="center">
			<tr>
				<td>Power Consumption charges</td>
				<td>:</td>
				<td><c:out value="${bil.getConsume()}"/></td>
			</tr>
			<tr>
				<td>Fixed charges</td>
				<td>:</td>
				<td><c:out value="${bil.getFixed()}"/></td>
			</tr>
			<tr>
				<td>Customer Charges</td>
				<td>:</td>
				<td><c:out value="${bil.getCustomer()}"/></td>
			</tr>
			<tr>
				<td>Electricity Duty</td>
				<td>:</td>
				<td><c:out value="${bil.getDuty()}"/></td>
			</tr>
			<tr>
				<td><span>Grand Total</span></td>
				<td>:</td>
				<td><span><c:out value="${bil.getTotal()}"/></span></td>
			</tr>
			<tr>
				<td id="thank" colspan="3">Thankyou Visit Again</td>
			</tr>
		</table>
		<h3 id="link"><a href="http://localhost:2626">Home page</a></h3>
		
	</body>
</html>