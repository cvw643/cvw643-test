package cvw643.test2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@ToString
@Getter
@Setter
@Entity
public class User extends BaseEntity {

    @OneToMany(fetch = FetchType.EAGER, orphanRemoval = true, cascade = CascadeType.ALL)
    private List<Address> addresses = new ArrayList<>();

    public void addAddress(String addressDetails) {
        addresses.add(new Address(this, addressDetails));
    }

    public void removeAddress(Address address) {
        addresses.remove(address);
    }
}
