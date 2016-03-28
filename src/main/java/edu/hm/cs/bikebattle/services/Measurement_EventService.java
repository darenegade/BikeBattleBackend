package edu.hm.cs.bikebattle.services;

import edu.hm.cs.bikebattle.domain.Measurement;
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
public class Measurement_EventService {
    // If you need access to the database you can autowire a Repository.
    //
    // @Autowired
    // <EntityName>Repository repo;


    void onAfterCreate(Measurement entity){
        //Add your Logic here
    }
    void onBeforeCreate(Measurement entity){
        //Add your Logic here
    }
    void onBeforeSave(Measurement entity){
        //Add your Logic here
    }
    void onAfterSave(Measurement entity){
        //Add your Logic here
    }
    void onBeforeLinkSave(Measurement parent, Object linked){
        //Add your Logic here
    }
    void onAfterLinkSave(Measurement parent, Object linked){
        //Add your Logic here
    }
    void onBeforeLinkDelete(Measurement parent, Object linked){
        //Add your Logic here
    }
    void onBeforeDelete(Measurement entity){
        //Add your Logic here
    }
    void onAfterDelete(Measurement entity){
        //Add your Logic here
    }
    void onAfterLinkDelete(Measurement parent, Object linked){
        //Add your Logic here
    }
}
