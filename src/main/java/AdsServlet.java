import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet (name = "AdsServlet", urlPatterns = "/ads")
public class AdsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Ads adsDao = DaoFactory.getAdsDao();
        List<Ad> Ads = adsDao.all();
        request.setAttribute("Ads", Ads);
        request.getRequestDispatcher("/ads/index.jsp").forward(request, response);
    }



//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
////        Long Id = request.getParameter(1L);
//        String UserName = request.getParameter("UserName");
//        String Description = request.getParameter("Description");
//        String Title = request.getParameter("Title");
//        AdModel yourAd = new AdModel(Id, UserName, Description, Title);
//        response.sendRedirect("/ads/index");
//    }
}