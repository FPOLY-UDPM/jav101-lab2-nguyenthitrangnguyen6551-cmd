package Bai3;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/form/update")
public class FormServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        Map<String, Object> map = new HashMap<>();
        map.put("fullname", "Nguyễn Văn Tèo");
        map.put("gender", true);
        map.put("country", "VN");

        req.setAttribute("user", map);
        req.setAttribute("editable", true);

        req.getRequestDispatcher("/Lab2_3/form.jsp").forward(req, resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");

        String fullname = req.getParameter("fullname");

        System.out.println("Fullname từ form gửi lên: " + fullname);

        req.getRequestDispatcher("/Lab2_3/form.jsp").forward(req, resp);
    }
}
