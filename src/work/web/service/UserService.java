package work.web.service;

/**
 * @author HuangHai
 * @date 2020/12/10 21:57
 */

import work.web.domain.Book;
import work.web.domain.Manager;
import work.web.domain.PageBean;
import work.web.domain.User;
import java.util.List;

/**
 * 用户管理的业务接口
 */
public interface UserService {
    /**
     *
     * @return
     */
    public List<User> findAll();//查询所有用户信息
    public Manager login (Manager manager);//登录验证
public int addUser(User user);//添加用户，这里返回Int类型我根本就没用到，改成viod 也行，只是比较麻烦就没改

    void deleteUser(String id);//删除用户

    public User findUser(String id);

    void update(User user);

    void delSelect(String[] ids);//删除选中的用户

    int addManager(Manager manager);//注册

    PageBean<User> findUserByPageServlet(String currentPage, String rows);

    List<User> moHuQuery(String username);

    Manager findPassword(String username);//找回密码


}
