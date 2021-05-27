import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html; charset=utf-8");
        response.getWriter().println("<h1>Hello World it is a great day</h1>");
        String name = request.getParameter("Nathan");
//        if (name != null) {
//            String name = "Nathan";
//        response.getWriter().println("Hello, <name>!");
    }
}
}

//doing this so that I can commit


//Bonus
//
//Make the page say "Hello, <name>!" if name is passed as part of the query string (e.g. /hello?name=codeup),
// otherwise default to "Hello, World!".
//
//Create a page view counter
//
//Create a page that displays a number that goes up by one every time the /count page is viewed.
//
//Bonus
//
//Allow the user to pass a parameter in the query string to reset the counter.

