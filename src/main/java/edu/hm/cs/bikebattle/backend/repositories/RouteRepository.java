package edu.hm.cs.bikebattle.backend.repositories;

<<<<<<< Updated upstream:src/main/java/edu/hm/cs/bikebattle/repositories/RouteRepository.java
import edu.hm.cs.bikebattle.domain.Difficulty;
import edu.hm.cs.bikebattle.domain.Route;
=======
import edu.hm.cs.bikebattle.backend.domain.Difficulty;
import edu.hm.cs.bikebattle.backend.domain.Route;
import org.springframework.data.geo.Circle;
>>>>>>> Stashed changes:src/main/java/edu/hm/cs/bikebattle/backend/repositories/RouteRepository.java
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.UUID;

/**
 * Organization: HM FK07.
 * Project: BikeBattleBackend, edu.hm.cs.bikebattle.repositories
 * Author(s): Rene Zarwel
 * Date: 27.03.16
 * OS: MacOS 10.11
 * Java-Version: 1.8
 * System: 2,3 GHz Intel Core i7, 16 GB 1600 MHz DDR3
 */
@RepositoryRestResource
public interface RouteRepository extends CrudRepository<Route, UUID> {

    List<Route> findByDifficulty(@Param("difficulty") Difficulty difficulty);

    List<Route> findByName(@Param("name") String name);
    List<Route> findByNameContainingIgnoreCase(@Param("name") String name);

    List<Route> findByOwnerOid(@Param(value = "oid") UUID oid);


}
