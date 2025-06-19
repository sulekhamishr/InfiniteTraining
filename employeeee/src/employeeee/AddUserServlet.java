package employeeee;

public class AddUserServlet {
	
	
	
	
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();
	String user, pwd;
	user=request.getParameter("Username");
	pwd=request.getParameter("passcode");
	EmployDao employdao= nw EmployDaoImp1();
	STring ency = EnceyptPassword.getCode(pwd);

}
