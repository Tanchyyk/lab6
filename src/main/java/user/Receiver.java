package user;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Receiver implements User {
    String status;
    String id;

    @Override
    public void update(String status) {
        this.status = status;
    }

    @Override
    public void setUniqueId() {
        this.id = new UniqueId().generateUniqueId();
    }

}
