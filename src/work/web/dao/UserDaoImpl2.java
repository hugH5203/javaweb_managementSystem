package work.web.dao;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import work.web.domain.Book;
import work.web.domain.Manager;
import work.web.domain.Order;
import work.web.domain.User;
import work.web.util.JDBCUtils;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author HuangHai
 * @date 2020/12/18 14:38
 */
public class UserDaoImpl2 implements UserDao {
            QueryRunner runner=new QueryRunner(JDBCUtils.get_druid_DataSource());
    @Override
    public List<User> findAll() {
        ArrayList<User> userlist= null;
        try {
            userlist = new ArrayList<>();
            String sql="select * from user ";
            userlist= (ArrayList<User>) runner.query(sql, new BeanListHandler(User.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userlist;
        }

    @Override
    public Manager findUserByPassword(String username, String password) {
        Manager manager = null;
        try {
             manager = runner.query("select * from admin where username =? and password =? ", new BeanHandler<Manager>(Manager.class),username,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return manager;
    }

    @Override
    public int addUser(User user) {
      int flag=0;
        try {
            flag=runner.update("insert into user values (null ,?,?,?,?,?,?)", user.getName(), user.getGender(), user.getAge(), user.getAddress(), user.getQq(), user.getEmail());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flag;

    }

    @Override
    public void deleteUser(int id) {
        try {
            int update = runner.update("delete from user where id=?", id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public User findUser(int id) {
        User user=null;
        try {
            user=runner.query("select * from user where id=?",new BeanHandler<User>(User.class),id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public void update(User user) {
        try {
            runner.update("update user set name=?,gender=?,age=?,address=?,qq=?,email=? where id=?",
                    user.getName(),user.getGender(),user.getAge(),user.getAddress(),user.getQq(),user.getEmail(),user.getId());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int addManager(Manager manager) {
        int insert=0;
        try {
            insert= runner.update("insert into admin values (null ,?,?)", manager.getUsername(), manager.getPassword());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return insert;
    }

    @Override
    public int findTotalCount() {
        int totalCount=0;
        try {
            totalCount=runner.query("select count(*) from user",new BeanHandler<Integer>(Integer.class));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return totalCount;
    }

    @Override
    public List<User> findByPage(int start, int rows) {
        List<User> query =null;
        try {
             query = runner.query("select * from user limit ?,? ", new BeanListHandler<>(User.class), start, rows);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return query;
    }

    @Override
    public int moHuDataTotal(String username) {
        int the=0;
        try {
            Integer query = runner.query("select count(*) from user where name like ? ", new BeanHandler<Integer>(Integer.class), "%" + username + "%");
            the=query;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return the;
    }

    @Override
    public List<User> moHuQuery(String username) {
        List<User> list = null;
        try {
            list = runner.query("select * from user where name like ?", new BeanListHandler<User>(User.class), "%"+username+"%");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public Manager findPassword(String username) {
        Manager manager=null;
        try {
            manager= runner.query("select * from admin where username=?" , new BeanHandler<Manager>(Manager.class),username);
        } catch (SQLException e) {
            e.printStackTrace();
        }
            return manager;
    }

    @Override
    public List<Book> findAllBook() {
        ArrayList<Book> booklist= new ArrayList<>();
        try {
            String sql="select * from booktable ";
            booklist= (ArrayList<Book>) runner.query(sql, new BeanListHandler(Book.class));
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return booklist;
    }

    @Override
    public List<Order> findAllOrder(int master) {
        ArrayList<Order> allOrder=null;
        try{
            allOrder=(ArrayList<Order>)runner.query("SELECT goods FROM `order` WHERE `master`=?",new BeanListHandler<Order>(Order.class),master);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("查找失败");
        }
        return allOrder;
    }

    @Override
    public int buyBook(int master, int goods) {
        int insert=0;
        try {
            insert= runner.update("insert into `order` values (?,?)", master,goods);
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("插入失败");
        }
        return insert;
    }

    @Override
    public Book findBookById(int id) {
        Book book=null;
        try {
            book=runner.query("select * from booktable where bookid=?",new BeanHandler<Book>(Book.class),id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return book;
    }

    @Override
    public void deleteOrder(int master, int goods) {
        try {
            runner.update("delete from `order` where `master`=? and goods=?", master,goods);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int updatePassword(String username, String oldPassword, String newPassword) {
        try {
            return runner.update("update admin set password = ? where username= ? and password= ?",newPassword,username,oldPassword);
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public int updateUsername(String oldUsername, String newUsername) {
        try {
            return runner.update("update admin set username = ? where username= ?",newUsername,oldUsername);
        } catch (SQLException e) {
            e.printStackTrace();
            return 0;
        }
    }
}

