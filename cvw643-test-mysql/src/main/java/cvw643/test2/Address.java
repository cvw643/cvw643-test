package cvw643.test2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@ToString
@Getter
@Setter
@Entity
public class Address extends BaseEntity {
    @ManyToOne(optional = false)
    private User user;

    private String details;

    public Address() {
    }

    public Address(User user, String details) {
        this.user = user;
        this.details = details;
    }
}
