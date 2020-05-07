package cvw643.test2;

import lombok.Data;

@Data
public class AddressDTO {
    private String id;

    private String userId;

    private String details;

    public AddressDTO(Address address) {
        this.id = address.getId();
        this.userId = address.getUser().getId();
        this.details = address.getDetails();
    }
}
