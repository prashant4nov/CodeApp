

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Mapping
 */
@WebServlet(asyncSupported = true, name = "mapping", urlPatterns = { "/mapping" })
public class Mapping extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int codeLength = 3;
   
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String input = request.getParameter("data").toString();
		if(input == null || input.length()<codeLength) {
			return;
		}
		DataCode dataCode = new DataCode();
		response.getWriter().append(dataCode.processRequest(input));
	}

}
