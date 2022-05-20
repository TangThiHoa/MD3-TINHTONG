import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "TinhTong", urlPatterns = "/TinhTong")
public class TinhTong extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       int x = Integer.parseInt(request.getParameter("a"));
       int y = Integer.parseInt(request.getParameter("b"));
       int sum = x + y;
        PrintWriter printWriter = response.getWriter();
        printWriter.print("<html>"+sum+"</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
