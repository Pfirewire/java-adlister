import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "GuessServlet", urlPatterns = "/guess")
public class Guess extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        int userGuess = Integer.parseInt(req.getParameter("userGuess"));
        if(userGuess < 1 || userGuess > 3) {
            System.out.println("Unacceptable user input");
            req.getRequestDispatcher("/guess.jsp").include(req, res);
        } else if (userGuess == 1) {
            req.getRequestDispatcher("/correct").include(req, res);
        } else {
            req.getRequestDispatcher("/incorrect").include(req, res);
        }
    }
}
