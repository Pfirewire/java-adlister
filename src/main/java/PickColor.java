import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "PickColorServlet", urlPatterns = "/pickcolor")
public class PickColor extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
//        String color = req.getParameter("color");
        System.out.println(req.getParameter("color"));
        req.getRequestDispatcher("/viewcolor").forward(req, res);
    }
}
