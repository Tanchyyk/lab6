package user;

public interface User {
    String status = "";
    String id = "";

    void update(String status);
    void setUniqueId();
}
