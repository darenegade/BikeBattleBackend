package edu.hm.cs.bikebattle.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
public class Route extends BaseEntity{

    @Length(min = 1)
    String name;

    boolean privat;

    @Min(0)
    float length;

    @Enumerated(EnumType.STRING)
    @NotNull
    Difficulty difficulty;

    @ElementCollection
    List<RoutePoint> routePoints = new ArrayList<>();
}
