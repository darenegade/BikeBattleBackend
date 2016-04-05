package edu.hm.cs.bikebattle.domain;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
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
public class Drive extends BaseEntity{

    @Min(0)
    float totalTime;

    @Min(0)
    float averageSpeed;

    @OneToMany
    List<Measurement> measurements = new ArrayList<>();

    @NotNull
    @NonNull
    @ManyToOne
    Route route;

}
