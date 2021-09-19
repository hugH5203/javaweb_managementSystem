package work.web.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author HuangHai
 * @date 2020/12/10 21:25
 */
@WebFilter("/*")
public class LoginFilter implements Filter {
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
         HttpServletRequest request = (HttpServletRequest)req;//先强转成http类型的request,不然不能操作
        String uri = request.getRequestURI();//获取请求页面的路径
        //判断是不是在登录页面或与登录相关的资源路径里，是的话就直接放行，否则需要登录
        if (uri.contains("/login.jsp")|| uri.contains("/findPasswordServlet") ||  uri.contains("/addManagerServlet") || uri.contains("/img/")|| uri.contains("/jtable.2.4.0/")|| uri.contains("/ui-layout-0.0.0/")|| uri.contains("/loginServlet") || uri.contains("/css/") || uri.contains("/script/") || uri.contains("/fonts/") || uri.contains("/checkCodeServlet")|| uri.contains("/assets/")){
            chain.doFilter(req, resp);//放行方法
        }else {
            Object manager = request.getSession().getAttribute("manager");//判断是否登录过，登录过应该有session的记录
            if (manager!=null){
                System.out.println("登录过");
                chain.doFilter(req,resp);//登录过就放行
            }else {
                request.setAttribute("login_msg","您尚未登录，请登录");//没有登录过，不能放行，而且给出提示信息
                request.getRequestDispatcher("/login.jsp").forward(request,resp);//跳转到要登录的页面
            }

        }


    }

    public void init(FilterConfig config) throws ServletException {

    }

    public void destroy() {
    }

}
