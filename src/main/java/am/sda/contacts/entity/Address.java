package am.sda.contacts.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor

@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_address")
    int idAddress;

    @Column(name = "city", nullable = false)
    String city;

    @Column(name = "streat")
    String streat;

    @Column(name = "zipcode")
    String zipCode;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_person")
    Person person;

}
