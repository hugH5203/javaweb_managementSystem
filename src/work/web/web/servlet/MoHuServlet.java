package work.web.web.servlet;

import work.web.dao.UserDaoImpl;
import work.web.domain.User;
import work.web.service.UserServiceImpl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author HuangHai
 * @date 2020/12/14 19:03
 */
@WebServlet("/moHuServlet")
public class MoHuServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        List<User> users=new UserServiceImpl().moHuQuery(( request.getParameter("username")));
        int total=new UserDaoImpl().moHuDataTotal(request.getParameter("username"));
        if(users!=null&&total!=0) {
            request.setAttribute("users", users);
            request.setAttribute("total", total);
            request.getRequestDispatcher("/moHuList.jsp").forward(request,response);
        }else {
            System.out.println(users);
            System.out.println(total);
            response.getWriter().write("查无此人！");
        }
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
