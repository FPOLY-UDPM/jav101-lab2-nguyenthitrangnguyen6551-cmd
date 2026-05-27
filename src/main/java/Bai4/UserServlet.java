package Bai4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import Bai4.User;

@WebServlet("/javaBean")
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.setAttribute("message", "Welcome to FPT Polytechnic");

        /*Map<String, Object> map = new HashMap<>();
        map.put("fullname", "Nguyễn Văn Tèo");
        map.put("gender", true);
        map.put("country", "Việt Nam");
        req.setAttribute("user", map);
        */
        User bean = new User();
        bean.setFullname("Nguyen van teo");
        bean.setGender(true);
        bean.setCountry("VN");

        req.setAttribute("user",bean);
        req.getRequestDispatcher("/Lab2_4/pageJavaBean.jsp").forward(req, resp);

    }

}
