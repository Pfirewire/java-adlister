import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "PizzaOrderServlet", urlPatterns = "/pizza-order")
public class PizzaOrder extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println(req.getParameter("crust-type"));
        System.out.println(req.getParameter("sauce-type"));
        System.out.println(req.getParameter("size"));
        for(int i = 1; i <= 5; i++) {
            if(req.getParameter("topping"+i) != null) {
                System.out.println(req.getParameter("topping"+i));
            }
        }
        System.out.println(req.getParameter("address"));
    }
}
