package work.web.domain;

/**
 * @author HuangHai
 * @date 2020/12/10 19:08
 */
public class Manager {
    private int id;
    private String username;
    private String password;

    public Manager(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Manager() {
    }

    public Manager(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
