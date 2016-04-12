package edu.hm.cs.bikebattle.domain;

import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.persistence.Embeddable;
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

@Embeddable
@Data
public class RoutePoint{

    @Range(min = -90, max = 90)
    double latitude;

    @Range(min = -180, max = 180)
    double longitude;

    @Min(0)
    double altitude;

    @Min(0)
    long time;
}
