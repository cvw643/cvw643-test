package cvw643.test2;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class UserDTO {
    private String id;

    private List<AddressDTO> addresses = new ArrayList<>();

    public UserDTO(User user) {
        this.id = user.getId();
        for (Address address : user.getAddresses()) {
            this.addresses.add(new AddressDTO(address));
        }
    }
}
