import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        if(req.getSession().getAttribute("loggedIn") == null || (boolean)req.getSession().getAttribute("loggedIn") != true) {
            req.getRequestDispatcher("/WEB-INF/login.jsp").forward(req, res);
        } else {
            req.getRequestDispatcher("/WEB-INF/profile.jsp").forward(req, res);
        }
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        boolean validAttempt = username.equals("admin") && password.equals("password");
        HttpSession session = req.getSession();
        session.setAttribute("user", username);
        if(validAttempt) {
            session.setAttribute("loggedIn", true);
        }

        if (validAttempt) {
            res.sendRedirect("/profile");
        } else {
            res.sendRedirect("/login");
        }
    }
}
