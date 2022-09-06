import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CountServlet", urlPatterns = "/count")
public class Count extends HttpServlet{
    private int count = 0;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        PrintWriter out = res.getWriter();
        String userReset = req.getParameter("reset");
        if(userReset == null) {
            count++;
        } else {
            count = 1;
        }
        out.printf("<h1>Counter: %s</hi>", count);
    }
}
