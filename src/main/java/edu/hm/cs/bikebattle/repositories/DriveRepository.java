package edu.hm.cs.bikebattle.repositories;

import edu.hm.cs.bikebattle.domain.Drive;
import org.springframework.data.jpa.repository.JpaRepository;
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
public interface DriveRepository extends JpaRepository<Drive, UUID> {

    /**
     * Find the Drive entities with the given Route oid.
     * @param oid the unique oid of the Route that will be searched for in the route relation.
     */
    List<Drive> findByRouteOid(@Param(value = "oid") UUID oid);

}
