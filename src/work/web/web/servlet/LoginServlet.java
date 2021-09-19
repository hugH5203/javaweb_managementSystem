package work.web.web.servlet;

import work.web.domain.Manager;
import work.web.domain.User;
import work.web.service.UserService;
import work.web.service.UserServiceImpl.UserServiceImpl;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Map;


/**
 * @author HuangHai
 * @date 2020/12/10 18:57
 */
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String verifycode = request.getParameter("verifycode");
        HttpSession session = request.getSession();
        String checkcode_server = (String) session.getAttribute("CHECKCODE_SERVER");
        session.removeAttribute("CHECKCODE_SERVER");
        if (checkcode_server == null || !checkcode_server.equalsIgnoreCase(verifycode)) {
//验证码错误
            request.setAttribute("login_msg", "验证码错误");
            request.getRequestDispatcher("/login.jsp").forward(request, response);
            return;
        }

        Map<String, String[]> map = request.getParameterMap();
        Manager manager = new Manager();
        try {
            BeanUtils.populate(manager, map);
        } catch (Exception e) {
            e.printStackTrace();
        }
        UserService service = new UserServiceImpl();
        Manager login = service.login(manager);
        if (login != null) {//登陆成功
            session.setAttribute("manager", login);
            response.sendRedirect(request.getContextPath()+"/cookieServlet");
        } else {
            request.setAttribute("login_msg", "用户名或密码错误");
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
