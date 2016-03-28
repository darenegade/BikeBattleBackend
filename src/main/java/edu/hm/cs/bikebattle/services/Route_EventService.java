package edu.hm.cs.bikebattle.services;

import edu.hm.cs.bikebattle.domain.Route;
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
public class Route_EventService {
    // If you need access to the database you can autowire a Repository.
    //
    // @Autowired
    // <EntityName>Repository repo;


    public void onAfterCreate(Route entity){
        //Add your Logic here
    }
    public void onBeforeCreate(Route entity){
        //Add your Logic here
    }
    public void onBeforeSave(Route entity){
        //Add your Logic here
    }
    public void onAfterSave(Route entity){
        //Add your Logic here
    }
    public void onBeforeLinkSave(Route parent, Object linked){
        //Add your Logic here
    }
    public void onAfterLinkSave(Route parent, Object linked){
        //Add your Logic here
    }
    public void onBeforeLinkDelete(Route parent, Object linked){
        //Add your Logic here
    }
    public void onBeforeDelete(Route entity){
        //Add your Logic here
    }
    public void onAfterDelete(Route entity){
        //Add your Logic here
    }
    public void onAfterLinkDelete(Route parent, Object linked){
        //Add your Logic here
    }
}
