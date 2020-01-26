import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;

public class SumServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException
	{
	PrintWriter out = res.getWriter();
	res.setContentType("text/html");
	int a=Integer.parseInt(req.getParameter("t1"));
	int b=Integer.parseInt(req.getParameter("t2"));
	int c=a+b;
	out.println("Sum of two no are"+c);
	}
}