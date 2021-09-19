package work.web.web.servlet;

import work.web.dao.UserDao;
import work.web.dao.UserDaoImpl2;
import work.web.domain.Book;
import work.web.domain.User;
import work.web.service.UserService;
import work.web.service.UserServiceImpl.UserServiceImpl;
import work.web.service.UserServiceImpl.UserServiceImpl2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author HuangHai
 * @date 2020/12/21 15:01
 */
@WebServlet("/findAllBookServlet")
public class FindAllBookServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserDao service=new UserDaoImpl2();
        List<Book>books  = service.findAllBook();
        request.setAttribute("books",books);
        request.getRequestDispatcher("/shop.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
