package br.com.cadastro;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.cadastro.dao.CadastroDAO;
import br.com.cadastro.model.Cadastro;

/**
 * Servlet implementation class CadastroServlet
 */
@WebServlet("/cadastroservlet")
public class CadastroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastroServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		String nomeCadastrado = request.getParameter("nome");
		
		CadastroDAO cadastroDao = new CadastroDAO();
		
		Cadastro cadastro = new Cadastro();
		cadastro.setNome(nomeCadastrado);
		cadastro.setDataCadastro(new Date());
		
		cadastroDao.save(cadastro);
		
		request.setAttribute("informe", "Cadastro Realizado Com Sucesso!");
		
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
	}

}
