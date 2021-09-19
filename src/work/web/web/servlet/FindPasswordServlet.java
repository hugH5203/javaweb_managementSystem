package work.web.web.servlet;

import work.web.domain.Manager;
import work.web.domain.User;
import work.web.service.UserServiceImpl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author HuangHai
 * @date 2020/12/14 20:39
 */
@WebServlet("/findPasswordServlet")
public class FindPasswordServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        Manager manager =new UserServiceImpl().findPassword(request.getParameter("username"));
        if(manager!=null) {
            response.getWriter().write("<h1>该账号密码为：</h1><br>"+manager.getPassword()+"<br><h2>快回去试试吧</h2>");
        }else {
            response.getWriter().write("查无此人");
        }
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
