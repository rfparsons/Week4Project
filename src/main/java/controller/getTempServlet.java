package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.tempConverter;

/**
 * Servlet implementation class getTempServlet
 */
@WebServlet("/getTempServlet")
public class getTempServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getTempServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userTemp = request.getParameter("userTemp");
		tempConverter convTemp = new tempConverter(Double.parseDouble(userTemp));
		
		request.setAttribute("convertedTemps", convTemp);
		getServletContext().getRequestDispatcher("/tempResult.jsp").forward(request, response);
		
//		PrintWriter writer = response.getWriter();
//		writer.println(convTemp.toString());
//		writer.close();
	}

}
