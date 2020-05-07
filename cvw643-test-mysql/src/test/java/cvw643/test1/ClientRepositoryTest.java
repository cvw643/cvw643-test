package cvw643.test1;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.Instant;
import java.util.Date;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ClientRepositoryTest {
    private final String datePattern = "yyyy-MM-dd HH:mm:ss.SSSZZ";

    @Autowired
    private ClientRepository clientRepository;

    @Test
    public void dummy() {
        System.out.println("ClientRepositoryTest.dummy");
        Date from = Date.from(Instant.ofEpochMilli(1588758973209L));
        Date to = from;
//        Date to = DateUtils.parseDate("2020-05-06 17:02:04.035", datePattern);
        System.out.println("from = " + DateFormatUtils.format(from, datePattern));
        System.out.println("to = " + DateFormatUtils.format(to, datePattern));
        List<Client> clients = clientRepository.findByCreatedDateBetween(from, to);
        System.out.println("clients = " + clients);
    }
}