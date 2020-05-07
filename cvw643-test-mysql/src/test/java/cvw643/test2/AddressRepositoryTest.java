package cvw643.test2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class AddressRepositoryTest {
    @Autowired
    private AddressRepository addressRepository;

    @Test
    public void findAll() {
        List<Address> all = addressRepository.findAll();
        for (Address address : all) {
            AddressDTO addressDTO = new AddressDTO(address);
            System.out.println("addressDTO = " + addressDTO);
        }
    }
}