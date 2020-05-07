package cvw643.test2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void create() {
        User user = new User();
        user.addAddress("1");
        user.addAddress("2");
        userRepository.save(user);
    }

    @Test
    public void addOneAddress() {
        List<User> all = userRepository.findAll();
        for (User user : all) {
            user.addAddress("2");
            userRepository.save(user);
            break;
        }
    }

    @Test
    public void updateComplex() {
        List<User> all = userRepository.findAll();
        for (User user : all) {
            List<Address> addresses = user.getAddresses();
            for (Address address : addresses) {
                address.setDetails("updated");
                break;
            }
            addresses.remove(1);
            addresses.add(new Address(user, "3"));
            userRepository.save(user);
            break;
        }
    }

    @Test
    public void updateOneAddress() {
        List<User> all = userRepository.findAll();
        for (User user : all) {
            for (Address address : user.getAddresses()) {
                address.setDetails("updated");
            }
            userRepository.save(user);
            break;
        }
    }

    @Test
    public void removeOneAddress() {
        List<User> all = userRepository.findAll();
        for (User user : all) {
            List<Address> addresses = user.getAddresses();
            addresses.remove(0);
            user.setAddresses(addresses);
            userRepository.save(user);
            break;
        }
    }

    @Test
    public void findAll() {
        List<User> all = userRepository.findAll();
        for (User user : all) {
            UserDTO userDTO = new UserDTO(user);
            System.out.println("userDTO = " + userDTO);
        }
    }
}