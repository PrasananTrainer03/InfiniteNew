

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Removeusernext extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public Removeusernext() 
    {
        super();        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		ServletContext sct = getServletContext();
		RequestDispatcher rd1 = sct.getRequestDispatcher("/AdminAccount");
		rd1.include(request, response);
		String selecteduser = (String) sct.getAttribute("SelectedUser");		
		if(selecteduser.length()!= 0)
		{
			try
			{
				Connection cp = ConnectionHelper.getConnection();
				
				String sql1 = " DELETE FROM TransReturn WHERE Username = ? ;" ;
				PreparedStatement s1 = cp.prepareStatement(sql1);
				s1.setString(1,selecteduser);
				s1.executeUpdate();			
				s1.close();
				
				String sql2 = " DELETE FROM Trans WHERE Username = ? ;" ;
				PreparedStatement s2 = cp.prepareStatement(sql2);
				s2.setString(1,selecteduser);
				s2.executeUpdate();
				s2.close();
				
				String sql3 = " DELETE FROM LibUsers WHERE Username = ? ;" ;
				PreparedStatement s3 = cp.prepareStatement(sql3);
				s3.setString(1,selecteduser);
				s3.executeUpdate();
				s3.close();
				
				sct.setAttribute("SelectedUser", "");
				sct.setAttribute("Removeuser","1");
				rd1.forward(request, response);					
			}			
			catch(Exception e)
			{e.printStackTrace();}			
		}
		else {out.write("<br/>Please Select User !...");}		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

}
