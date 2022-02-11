package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.PizzaDivider;

/**
 * Servlet implementation class getPizzaServlet
 */
@WebServlet("/getPizzaServlet")
public class getPizzaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getPizzaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub		
		String userSlices = request.getParameter("userPizza");

		PizzaDivider userPizza= new PizzaDivider(Integer.parseInt(userSlices));
		
		userPizza.dividePizza();
		
		request.setAttribute("userPizzaBox", userPizza);
		
		getServletContext().getRequestDispatcher("/resultsDivider.jsp").forward(request, response);
	}

}
