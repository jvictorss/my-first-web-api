package dio.myfirstwebapi.model;

public class Usuario {
    private Integer id;
    private String login;
    private String password;

    public Usuario() {}
    public Usuario(String login, String password) {
        this.login = login;
        this.password = password;
    }
    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\''+
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
