package work.web.web.servlet;

import work.web.domain.Manager;
import work.web.service.UserServiceImpl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.management.MemoryManagerMXBean;

/**
 * @author HuangHai
 * @date 2020/12/13 22:11
 */
@WebServlet("/addManagerServlet")
public class AddManagerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        Manager manager= new Manager(request.getParameter("username666"),request.getParameter("password1"));
        int insert=new UserServiceImpl().addManager(manager);
        System.out.println(manager);
        if (insert>0){
            response.sendRedirect(request.getContextPath() + "/login.jsp");
        }else {
            System.out.println(insert+"失败");
            //request.setAttribute("failAdd","添加失败");
            //request.getRequestDispatcher("/login.jsp").forward(request,response);
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
