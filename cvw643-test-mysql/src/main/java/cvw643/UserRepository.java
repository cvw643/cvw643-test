package cvw643;

import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findByCreatedDateBetween(Timestamp from, Timestamp to);
    List<User> findByCreatedDateBetween(Date from, Date to);
}
