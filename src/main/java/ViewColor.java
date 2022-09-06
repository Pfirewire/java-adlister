import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ViewColorServlet", urlPatterns = "/viewcolor")
public class ViewColor extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println(req.getParameter("color"));
        req.setAttribute("bgColor", req.getParameter("color"));
        req.getRequestDispatcher("/viewcolor.jsp").forward(req, res);
    }
}
