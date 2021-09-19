package work.web.web.servlet;

import work.web.dao.UserDaoImpl2;
import work.web.domain.Manager;
import work.web.service.UserServiceImpl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author HuangHai
 * @date 2020/12/23 14:07
 */
@WebServlet("/updatePasswordServlet")
public class UpdatePasswordServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        int flag=new UserDaoImpl2().updatePassword(request.getParameter("name"),request.getParameter("oldPassword"),request.getParameter("newPassword1"));
        if(flag>0) {
            response.getWriter().write("<h1>修改成功！</h1><br>"+"<br><h2><a href='"+request.getContextPath()+"/login.jsp'"+">去登录</a></h2>");

        }else {
            response.getWriter().write("修改失败");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
