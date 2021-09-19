package work.web.service.UserServiceImpl;

import work.web.dao.UserDao;
import work.web.dao.UserDaoImpl;
import work.web.dao.UserDaoImpl2;
import work.web.domain.Manager;
import work.web.domain.PageBean;
import work.web.domain.User;
import work.web.service.UserService;

import java.util.List;

/**
 * @author HuangHai
 * @date 2020/12/18 15:47
 */
public class UserServiceImpl2 implements UserService {
    private UserDao dao = new UserDaoImpl2();

    @Override
    public List<User> findAll() {
        //调用dao 层完成查询
        return dao.findAll();
    }

    @Override
    public Manager login(Manager manager) {
        return dao.findUserByPassword(manager.getUsername(), manager.getPassword());
    }


    @Override
    public int addUser(User user) {
        return dao.addUser(user);
    }

    @Override
    public void deleteUser(String id) {
        dao.deleteUser(Integer.parseInt(id));
    }

    @Override
    public User findUser(String id) {
        return dao.findUser(Integer.parseInt(id));
    }

    @Override
    public void update(User user) {
        dao.update(user);
    }

    @Override
    public PageBean<User> findUserByPageServlet(String current_Page, String row_s) {
        int currentPage = Integer.parseInt(current_Page);
        int rows = Integer.parseInt(row_s);

        if (currentPage <= 0) {
            currentPage = 1;
        }

        PageBean<User> pb = new PageBean<User>();
        pb.setRows(rows);
        int totalCount = dao.findTotalCount();
        pb.setTotalCount(totalCount);
        int totalPage = (totalCount % rows) == 0 ? totalCount / rows : (totalCount / rows);
        pb.setTotalPage(totalPage);
        if (currentPage >= totalPage) {
            currentPage = totalPage;
        }
        pb.setCurrentPage(currentPage);
        int start = (currentPage - 1) * rows;
        List<User> list = dao.findByPage(start, rows);
        pb.setList(list);
        return pb;
    }

    @Override
    public void delSelect(String[] ids) {
        if (ids != null && ids.length > 0) {
            for (String id : ids) {
                dao.deleteUser(Integer.parseInt(id));
            }
        }
    }

    @Override
    public int addManager(Manager manager) {
        return dao.addManager(manager);
    }

    @Override
    public List<User> moHuQuery(String username) {
        return dao.moHuQuery(username);
    }

    @Override
    public Manager findPassword(String username) {
        return dao.findPassword(username);
    }
}
