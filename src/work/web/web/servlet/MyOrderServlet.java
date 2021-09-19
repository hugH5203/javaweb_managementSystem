package work.web.web.servlet;

import work.web.dao.UserDao;
import work.web.dao.UserDaoImpl2;
import work.web.domain.Book;
import work.web.domain.Manager;
import work.web.domain.Order;
import work.web.domain.User;
import work.web.service.UserService;
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
 * @date 2020/12/21 15:44
 */
@WebServlet("/myOrderServlet")
public class MyOrderServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserDao service=new UserDaoImpl2();
        Manager manager= (Manager) request.getSession().getAttribute("manager");
        ArrayList<Book> books=new ArrayList<>();
        List<Order>orders  = service.findAllOrder(manager.getId());
        for (Order order : orders) {
            Book book = service.findBookById(order.getGoods());
            books.add(book);
        }
        request.setAttribute("books",books);
        System.out.println(books);
        request.getRequestDispatcher("/managerOrder.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
