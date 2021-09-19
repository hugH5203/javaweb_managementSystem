package work.web.dao;

/**
 * @author HuangHai
 * @date 2020/12/10 22:03
 */

import work.web.domain.Book;
import work.web.domain.Manager;
import work.web.domain.Order;
import work.web.domain.User;

import java.util.List;

/**
 * 用户对数据的访问dao
 */
public interface UserDao {
    public List<User> findAll();

    public Manager findUserByPassword(String username, String password);

    public int addUser(User user);

    public void deleteUser(int id);

    public User findUser(int id);

    void update(User user);
    public int  addManager(Manager manager);

    int findTotalCount();//查询总记录数

    List<User> findByPage(int start,int rows);//

    int moHuDataTotal(String username);//模糊查询的数据数目

    List<User> moHuQuery(String username);

    Manager findPassword(String username);//找回密码

    List<Book> findAllBook();//所有书籍

    Book findBookById(int id);//根据ID查书籍

    List<Order> findAllOrder(int master);//根据管理员ID查询其购买的书籍(订单表)

    int   buyBook(int master ,int goods);//管理员买书（订单表）

    void deleteOrder(int master,int goods);//删除该管理员的订单

    int updatePassword(String username,String oldPassword,String newPassword);//修改管理员的密码

    int updateUsername(String oldUsername,String newUsername);//修改管理员的昵称
}
