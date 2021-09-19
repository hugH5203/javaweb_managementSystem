package work.web.web.servlet;

import work.web.dao.UserDao;
import work.web.dao.UserDaoImpl2;
import work.web.domain.Manager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author HuangHai
 * @date 2020/12/21 15:58
 */
@WebServlet("/buyBookServlet")
public class BuyBookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserDao service=new UserDaoImpl2();
        Manager manager= (Manager) request.getSession().getAttribute("manager");
           int id= Integer.parseInt(request.getParameter("id"));
           service.buyBook(manager.getId(),id);
        response.sendRedirect(request.getContextPath()+"/myOrderServlet");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
