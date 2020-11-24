import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "testServlet",urlPatterns = "/index")
public class testServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("ac");
        RequestDispatcher requestDispatcher = null;
        if(action.equals("A")){
            requestDispatcher = request.getRequestDispatcher("aaaa.jsp");
        }else if(action.equals("B")){
            requestDispatcher = request.getRequestDispatcher("bbbb.jsp");
        }else{
            requestDispatcher = request.getRequestDispatcher("cccc.jsp");
        }
        requestDispatcher.forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



    }
}
