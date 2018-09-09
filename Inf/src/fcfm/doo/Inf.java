package fcfm.doo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class fgdfgfd
 */
@WebServlet("/Inf")
public class Inf extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Calendar calendario;
	private int minutos;
	private int hora;
	private int segundos;
	private String ip = null;
	
	/**
     * @see HttpServlet#HttpServlet()
     */

	public Inf() {
        super();
        // TODO Auto-generated constructor stub
    }
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pr = response.getWriter();
		
		ip = request.getRemoteAddr();
		
		
		calendario = Calendar.getInstance();
		hora = calendario.get(Calendar.HOUR_OF_DAY);
		minutos = calendario.get(Calendar.MINUTE);
		segundos = calendario.get(Calendar.SECOND);
		
		pr.println("La hora es: " + hora + ":" + minutos + ":" + segundos);
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		 
		out.println("<br><html><head><title>Obtener IP del cliente</title></head><body></br>");
		out.println("<strong>Obtener la IP del cliente </strong>");
		out.println("La ip es " + ip + "<br>");
		out.println("</body></html>");
			
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
