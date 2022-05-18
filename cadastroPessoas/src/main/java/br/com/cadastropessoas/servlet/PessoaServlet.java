package br.com.cadastropessoas.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.cadastropessoas.service.PessoaService;

/**
 * Servlet implementation class PessoaServlet
 */
@WebServlet("/pessoaservlet")
public class PessoaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PessoaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		
		PessoaService pessoaService = new PessoaService();
		
		//List<PessoaDao> listaUsuario = pessoaDao.getListaPessoas();
		//ArrayList<Pessoa> listaPessoas = pessoaService.getPessoas();
		
		//request.setAttribute("sessaoListaPessoa", listaUsuario);
		
		
		//****METODO DELETAR****
		String id = request.getParameter("id");
		
		pessoaService.deletePessoa(id);
		//****METODO DELETAR****
		
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		String nome = request.getParameter("nome");
		String idade = request.getParameter("idade");
		String sexo = request.getParameter("sexo");
		String id = request.getParameter("id");
		String acao = request.getParameter("acao");
		
		PessoaService pessoaService = new PessoaService();

		if(acao.equals("Inserir")) {
			
			pessoaService.postPessoas(nome, idade, sexo);
		}
		
		//**********METODO PUT****************//
		else if(acao.equals("Alterar")) {
			
			pessoaService.putPessoas(nome, idade, sexo, id);
		}
		//**********METODO PUT****************//
		
		
		//***********LIMPAR*****************
		/*else if(acao.equals("Limpar")) {
			
			request.setAttribute("limpar", "");
			
		}*/
		
		//***********LIMPAR*****************
		
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
	}
}
