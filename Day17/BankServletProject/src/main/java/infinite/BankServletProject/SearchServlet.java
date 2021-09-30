package infinite.BankServletProject;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchServlet
 */
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		int empno = Integer.parseInt(request.getParameter("accountNo"));
		BankDAO dao = new BankDAO();
		Bank bank=null;
		try {
			bank = dao.searchAccount(empno);
			if (bank!=null) {
				out.println("First Name  " +bank.getFirstName() + "<br/>");
				out.println("Last Name  " +bank.getLastName() + "<br/>");
				out.println("City  "+bank.getCity() + "<br/>");
				out.println("State  " +bank.getState() + "<br/>");
				out.println("Amount  " +bank.getAmount() + "<br/>");
				out.println("Cheq Facility  "+bank.getCheqFacil() + "<Br/>");
				out.println("Account Type " +bank.getAccountType() + "<br/>");
			} else {
				out.println("*** Record Not Found ***");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
