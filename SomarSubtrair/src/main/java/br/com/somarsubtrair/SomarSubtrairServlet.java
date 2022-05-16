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
		
		String acao = request.getParameter("ação");
		String valorNumero1 = request.getParameter("numero1");
		String valorNumero2 = request.getParameter("numero2");
		String resultado = "";
		
		SomarSubtrairService service = new SomarSubtrairService();
		
		if(acao.equals("Somar")) {
			
			resultado = service.somar(valorNumero1, valorNumero2);
			
		}else if(acao.equals("Subtrair")){
			
			resultado = service.subtrair(valorNumero1, valorNumero2);
			
		}

		request.setAttribute("resultado", resultado);
			
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
	}

}
