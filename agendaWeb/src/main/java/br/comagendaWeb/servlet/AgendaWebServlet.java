package br.comagendaWeb.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.agendaWeb.service.AgendaWebService;

/**
 * Servlet implementation class AgendaWebServlet
 */
@WebServlet("/agendawebservlet")
public class AgendaWebServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgendaWebServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    //Objeto Classe AgendaWebService
    AgendaWebService agendaWebService = new AgendaWebService();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		String atualizarLista = request.getParameter("atualizar");
		
		ArrayList<AgendaWebService> listaRegistro = new ArrayList<>();
		
	
		listaRegistro = agendaWebService.registros();
		
		//PONTO DE DUVIDA
		for(AgendaWebService lista : listaRegistro) {
			request.setAttribute("id", lista.getId());
			request.setAttribute("nome", lista.getNome());
			request.setAttribute("telefone", lista.getTelefone());
			request.setAttribute("dataCadastro", lista.getDataCadastro());
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		String nome = request.getParameter("nome");
		String telefone = request.getParameter("telefone");
		
		agendaWebService.save(nome, telefone);
		
		request.setAttribute("informe", "Cadastro Realizado Com Sucesso!");
		
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
	}

}
