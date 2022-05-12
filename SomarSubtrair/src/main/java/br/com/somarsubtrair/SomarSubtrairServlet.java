package br.com.somarsubtrair;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SomarSubtrair
 */
@WebServlet("/somarSubtrair")
public class SomarSubtrairServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SomarSubtrairServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		String soma = request.getParameter("somar");
		String subtrair = request.getParameter("subtrair");
		String valorN1 = request.getParameter("n1");
		String valorN2 = request.getParameter("n2");
		
		SomarSubtrairService service = new SomarSubtrairService();

		String valor = service.calculo(soma, subtrair, valorN1, valorN2);

		request.setAttribute("resultado", valor);
			
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
	}

}
