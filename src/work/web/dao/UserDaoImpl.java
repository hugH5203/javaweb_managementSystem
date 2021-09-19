package work.web.dao;

import work.web.domain.Book;
import work.web.domain.Manager;
import work.web.domain.Order;
import work.web.domain.User;
import work.web.util.JDBCUtils;
import work.web.util.*;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import work.web.dao.UserDao;

import java.util.List;

/**
 * @author HuangHai
 * @date 2020/12/10 22:04
 */
public class UserDaoImpl implements UserDao {
    private JdbcTemplate template=new JdbcTemplate(JDBCUtils.get_druid_DataSource());
    @Override
    public List<User> findAll() {
        //使用jdbc来实对数据库的访问
        List<User> users = template.query("select * from user", new BeanPropertyRowMapper<User>(User.class));
        return users;
    }

    @Override
    public int findTotalCount() {
        return template.queryForObject("select count(*) from user",Integer.class);
    }

    @Override
    public List<User> findByPage(int start, int rows) {
        return template.query("select * from user limit ?,? ",new BeanPropertyRowMapper<User>(User.class),start,rows);
    }

    @Override
    public Manager findUserByPassword(String username, String password){
        try {
            Manager manager = template.queryForObject("select * from admin where username=? and password=?", new BeanPropertyRowMapper<Manager>(Manager.class), username, password);
            return manager;
        } catch (DataAccessException e) {
            System.out.println("密码或用户名错误！");
            e.printStackTrace();

            return null;
        }

    }

    @Override
    public int addUser(User user) {
        try {
            int update = template.update("insert into user values (null ,?,?,?,?,?,?)", user.getName(), user.getGender(), user.getAge(), user.getAddress(), user.getQq(), user.getEmail());
            return update;
        } catch (DataAccessException e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public void deleteUser(int id) {
        try {
            template.update("delete from user where id=?",id);
        } catch (DataAccessException e) {
            e.printStackTrace();
        }
    }

    @Override
    public User findUser(int id) {
        return template.queryForObject("select * from user where id=?",new BeanPropertyRowMapper<User>(User.class),id);
    }

    @Override
    public void update(User user) {
        template.update("update user set name=?,gender=?,age=?,address=?,qq=?,email=? where id=?",
                user.getName(),user.getGender(),user.getAge(),user.getAddress(),user.getQq(),user.getEmail(),user.getId());
    }

    @Override
    public int addManager(Manager manager) {
            int update = template.update("insert into admin values (null ,?,?)", manager.getUsername(), manager.getPassword());
            return update;
        }

    @Override
    public List<User> moHuQuery(String username) {
        List<User> list = template.query("select * from user where name like ?", new BeanPropertyRowMapper<User>(User.class), "%"+username+"%");
        return list;
    }

    @Override
    public int moHuDataTotal(String username) {
        return template.queryForObject("select count(*) from user where name like ? ",Integer.class,"%"+username+"%");
    }

    @Override
    public Manager findPassword(String username) {
        return template.queryForObject("select * from admin where username=?" , new BeanPropertyRowMapper<Manager>(Manager.class),username);
    }

    @Override
    public List<Book> findAllBook() {
        List<Book>books=template.query("select * from booktable", new BeanPropertyRowMapper<Book>(Book.class));
        return books;
    }

    @Override
    public List<Order> findAllOrder(int master) {
        List<Order>goods=template.query("select goods from `order`", new BeanPropertyRowMapper<Order>(Order.class));
        return goods;
    }

    @Override
    public int  buyBook( int master,int goods) {
        int update = template.update("insert into `order` values (?,?)", master,goods);
        return update;
    }

    @Override
    public Book findBookById(int id) {
        return template.queryForObject("select * from booktable where id=?",new BeanPropertyRowMapper<Book>(Book.class),id);
    }

    @Override
    public void deleteOrder(int master, int goods) {
        template.update("delete from `order` where `master`=? and goods=? ",master,goods);
    }

    @Override
    public int updatePassword(String username, String oldPassword, String newPassword) {
        return template.update("update admin set password = ? where username= ? and password= ?",newPassword,username,oldPassword);
    }

    @Override
    public int updateUsername(String oldUsername, String newUsername) {
        return template.update("update admin set username = ? where username= ?",newUsername,oldUsername);

    }
}
