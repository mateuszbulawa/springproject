package pl.mbulawa.springproject.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String address;
    private String city;
    private String state;
    private String zipcode;

    public Publisher(String name, String address, String city, String state, String zipcode) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }
}
