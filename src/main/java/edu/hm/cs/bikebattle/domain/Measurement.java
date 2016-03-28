package edu.hm.cs.bikebattle.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.validation.constraints.Min;


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
public class Measurement extends BaseEntity{

    @Min(0)
    float time;

    @Min(0)
    float speed;

    @Embedded
    RoutePoint routePoint;
}
