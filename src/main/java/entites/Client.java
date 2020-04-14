package entites;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "client")
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idClient;

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    @Column(nullable = false, length = 50)
    private String second_address;

    @Column(nullable = false, length = 50)
    private String fax_number;

    @Column(nullable = false, length = 50)
    private String user_name;

    public String getFax_number() {
        return fax_number;
    }

    public void setFax_number(String fax_number) {
        this.fax_number = fax_number;
    }

    public String getSecond_address() {
        return second_address;
    }

    public void setSecond_address(String second_address) {
        this.second_address = second_address;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }
}