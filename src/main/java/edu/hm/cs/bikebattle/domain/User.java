package edu.hm.cs.bikebattle.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.Min;
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
