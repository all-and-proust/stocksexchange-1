<%@ page import="java.util.*,com.stocks.model.*" %>
<html>
<head>
	<title>Most Active Stocks</title>
</head>
<body>
<b>Most Active Stocks</b>
<br/>
<br/>
<table border = "1">
	<tr>
		<td>Rank</td>
		<td>Stock Symbol</td>
		<td>Frequency</td>
	</tr>
	<%
	List<Stock> stocks = (List<Stock>)request.getAttribute("mostActive");
	int ctr = 0;
	for(Stock s: stocks){
		ctr++;
	%>
	<tr>
		<td><%= ctr %></td>
		<td><a href="HistoricalData.do?symbol=<%= s.getStockSymbol() %>&frequency=<%= s.getFrequency() %>"><%= s.getStockSymbol() %></a></td>
		<td><%= s.getFrequency() %></td>
	</tr>
	<%
	}
	%>
</table>
<br/>
<br/>
<a href="DataImport.do">Import Data From CSV!</a>
<br/>
<a href="DataImportPSEView.do">Import Data Directly from PSE!</a>
<br/>
<a href="AllStocks.do">View All Stocks With Frequency</a>
</body>
</html>