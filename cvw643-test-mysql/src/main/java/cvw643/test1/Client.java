package cvw643.test1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@ToString
@Getter
@Setter
@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private long createdDate;

    @PrePersist
    void onPersist() {
        createdDate = System.currentTimeMillis();
    }
}
