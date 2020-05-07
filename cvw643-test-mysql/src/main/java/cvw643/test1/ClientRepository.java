package cvw643.test1;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Integer> {
    List<Client> findByCreatedDateBetween(Date from, Date to);
}
