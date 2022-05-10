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
public class SomarSubtrair extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SomarSubtrair() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		float n1 = 0;
		float n2 = 0;
		float resultado = 0;
		String valor = "";
		
		response.setContentType("text/html");
		
		String valorN1 = request.getParameter("n1");
		String valorN2 = request.getParameter("n2");
		
		n1 = Float.parseFloat(valorN1);
		n2 = Float.parseFloat(valorN2);
		
		if(request.getParameter("somar") != null) {
			
			resultado = n1 + n2;
			valor = Float.toString(resultado);
			
			request.setAttribute("resultado", valor);
			
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
			
		}else if(request.getParameter("subtrair") != null){
			
			resultado = n1 - n2;
			
			valor = Float.toString(resultado); //DUVIDA DUVIDA DUVIDA
			
			request.setAttribute("resultado", valor);
			
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
			
		}
		
	}

}
