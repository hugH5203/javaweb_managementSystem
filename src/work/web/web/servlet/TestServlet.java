package work.web.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author HuangHai
 * @date 2020/12/13 22:00
 */

/**
 * 此类仅用于测试脏话过滤器是否有效
 */
@WebServlet("/testServlet")
public class TestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write("<h1>修改成功！</h1><br>"+"<br><h2><a href='"+request.getContextPath()+"/login.jsp'"+">去登录</a></h2>");
        String name = request.getParameter("name");
        String msg = request.getParameter("msg");
        System.out.println(name+"和    "+msg);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
