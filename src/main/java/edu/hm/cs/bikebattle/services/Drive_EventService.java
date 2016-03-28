package edu.hm.cs.bikebattle.services;

import edu.hm.cs.bikebattle.domain.Drive;
import org.springframework.stereotype.Service;

/**
 * Organization: HM FK07.
 * Project: BikeBattleBackend, edu.hm.cs.bikebattle.services
 * Author(s): Rene Zarwel
 * Date: 28.03.16
 * OS: MacOS 10.11
 * Java-Version: 1.8
 * System: 2,3 GHz Intel Core i7, 16 GB 1600 MHz DDR3
 */
@Service
public class Drive_EventService {
    // If you need access to the database you can autowire a Repository.
    //
    // @Autowired
    // <EntityName>Repository repo;


    void onAfterCreate(Drive entity){
        //Add your Logic here
    }
    void onBeforeCreate(Drive entity){
        //Add your Logic here
    }
    void onBeforeSave(Drive entity){
        //Add your Logic here
    }
    void onAfterSave(Drive entity){
        //Add your Logic here
    }
    void onBeforeLinkSave(Drive parent, Object linked){
        //Add your Logic here
    }
    void onAfterLinkSave(Drive parent, Object linked){
        //Add your Logic here
    }
    void onBeforeLinkDelete(Drive parent, Object linked){
        //Add your Logic here
    }
    void onBeforeDelete(Drive entity){
        //Add your Logic here
    }
    void onAfterDelete(Drive entity){
        //Add your Logic here
    }
    void onAfterLinkDelete(Drive parent, Object linked){
        //Add your Logic here
    }
}
