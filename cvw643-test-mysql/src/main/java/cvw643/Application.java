package cvw643;

import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@EnableJpaAuditing
@RequiredArgsConstructor
@SpringBootApplication
public class Application implements CommandLineRunner {

    //        System.out.println("Application.run");


//        User user = userRepository.findById(1).orElse(null);
//        System.out.println("user = " + user);

    private final String datePattern = "yyyy-MM-dd HH:mm:ss.SSS";

    public static void main(String... args) {
        SpringApplication.run(Application.class, args);
    }

    private final UserRepository userRepository;
    private final ClientRepository clientRepository;

//    @Override
//    public void run(String... args) throws Exception {
//        Timestamp from = Timestamp.valueOf("2020-05-06 17:02:04.035");
//        Timestamp to = Timestamp.valueOf("2020-05-06 17:02:04.035");
//        System.out.println("from = " + DateFormatUtils.format(from, datePattern));
//        System.out.println("to = " + DateFormatUtils.format(to, datePattern));
//        List<User> users = userRepository.findByCreatedDateBetween(from, to);
//        System.out.println("users = " + users);
//    }

    @Override
    public void run(String... args) throws Exception {
        Date from = DateUtils.parseDate("2020-05-06 19:03:12.773", datePattern);
        Date to = DateUtils.parseDate("2020-05-06 19:03:12.773", datePattern);
        System.out.println("from = " + DateFormatUtils.format(from, datePattern));
        System.out.println("to = " + DateFormatUtils.format(to, datePattern));
        List<User> users = userRepository.findByCreatedDateBetween(from, to);
        System.out.println("users = " + users);
    }

//    @Override
//    public void run(String... args) throws Exception {
//        Date from = Date.from(Instant.ofEpochMilli(1588758973209L));
//        Date to = from;
////        Date to = DateUtils.parseDate("2020-05-06 17:02:04.035", datePattern);
//        System.out.println("from = " + DateFormatUtils.format(from, datePattern));
//        System.out.println("to = " + DateFormatUtils.format(to, datePattern));
//        List<Client> clients = clientRepository.findByCreatedDateBetween(from, to);
//        System.out.println("clients = " + clients);
//    }
}
