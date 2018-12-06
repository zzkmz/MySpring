package top.zhaozikai.servlet;

import javafx.scene.input.TouchEvent;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

/*@WebServlet(name = "HelloServlet",urlPatterns = "/hello.view")*/
public class HelloServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String name =  request.getParameter("name");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>hello</title>");
        out.println("</head>");

        out.println("<body>");
        out.println("<h1>hello "+ name +"</h1>");
        out.println("contextpath: "+request.getContextPath());
        out.println("<br>");
        out.println("servletpath: "+request.getServletPath());
        out.println("<br>");
        out.println("URItpath: "+request.getRequestURI());
        out.println("<br>");
        out.println("UTLtpath: "+request.getRequestURL());
        out.println("</body>");
        out.println("</html>");


    }
}
