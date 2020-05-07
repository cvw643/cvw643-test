package cvw643.test2;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseEntity {
    @Id
    private String id;

    @CreatedDate
    @Column(nullable = false, updatable = false, columnDefinition = "DATETIME(3)")
    private Date createdAt;

    @LastModifiedDate
    @Column(nullable = false, updatable = true, columnDefinition = "DATETIME(3)")
    private Date lastModifiedAt;

    @Version
    @Column(nullable = false, updatable = true)
    private long version;

    @PrePersist
    private void setId() {
        if (id == null) {
            id = UUID.randomUUID().toString();
        }
    }
}
