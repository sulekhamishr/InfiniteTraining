package Infinite.helloServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        String user = request.getParameter("Username");
        String pwd = request.getParameter("passcode");

        // Check for empty values
        if (user == null || pwd == null || user.isEmpty() || pwd.isEmpty()) {
            out.print("<p style='color:red;'>Username or password cannot be empty.</p>");
            RequestDispatcher disp = request.getRequestDispatcher("login.html");
            disp.include(request, response);
            return;
        }

        // Check for valid credentials
        if (user.equals("Infinite") && pwd.equals("Infinite")) {
            RequestDispatcher disp = request.getRequestDispatcher("Menu.html");
            disp.forward(request, response);
        } else {
            RequestDispatcher disp = request.getRequestDispatcher("login.html");
            disp.include(request, response);
            out.print("<p style='color:red;'>Invalid credentials</p>");
        }
    }
}
