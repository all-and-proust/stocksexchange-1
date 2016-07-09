package com.stocks.web;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import com.stocks.model.*;
import com.stocks.model.dao.impl.StocksDaoImpl;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class DataImportPSE extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServletException {

		StocksDaoImpl ss = new StocksDaoImpl();
		ss.removeData(request.getParameter("tradingDate"));
		List<Map<String,String>> liveDataFromPSE = ss.viewDataFromPSE();
		int importResult = ss.importData(liveDataFromPSE);

		request.setAttribute("importResult",importResult);
		RequestDispatcher view = request.getRequestDispatcher("DataImportPSE.jsp");
		view.forward(request,response);
	}
}