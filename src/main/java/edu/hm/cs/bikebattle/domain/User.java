package edu.hm.cs.bikebattle.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;


/**
 * Organization: HM FK07.
 * Project: BikeBattleBackend, edu.hm.cs.bikebattle.domain
 * Author(s): Rene Zarwel
 * Date: 27.03.16
 * OS: MacOS 10.11
 * Java-Version: 1.8
 * System: 2,3 GHz Intel Core i7, 16 GB 1600 MHz DDR3
 */

@Entity
@Data
@RequiredArgsConstructor
public class User extends BaseEntity{

    @Length(min = 1)
    String name;

    @Email(regexp = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")
    @NotNull
    @Column(unique = true)
    String email;

    @Min(0)
    float size;

    @Min(0)
    float weight;

    @ManyToMany
    List<User> friends = new ArrayList<>();

    @OneToMany
    List<Route> routes = new ArrayList<>();

    @OneToMany
    List<Drive> drives = new ArrayList<>();
}
