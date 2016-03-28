package edu.hm.cs.bikebattle.services;

import edu.hm.cs.bikebattle.domain.RoutePoint;
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
public class RoutePoint_EventService {
    // If you need access to the database you can autowire a Repository.
    //
    // @Autowired
    // <EntityName>Repository repo;


    public void onAfterCreate(RoutePoint entity){
        //Add your Logic here
    }
    public void onBeforeCreate(RoutePoint entity){
        //Add your Logic here
    }
    public void onBeforeSave(RoutePoint entity){
        //Add your Logic here
    }
    public void onAfterSave(RoutePoint entity){
        //Add your Logic here
    }
    public void onBeforeLinkSave(RoutePoint parent, Object linked){
        //Add your Logic here
    }
    public void onAfterLinkSave(RoutePoint parent, Object linked){
        //Add your Logic here
    }
    public void onBeforeLinkDelete(RoutePoint parent, Object linked){
        //Add your Logic here
    }
    public void onBeforeDelete(RoutePoint entity){
        //Add your Logic here
    }
    public void onAfterDelete(RoutePoint entity){
        //Add your Logic here
    }
    public void onAfterLinkDelete(RoutePoint parent, Object linked){
        //Add your Logic here
    }
}
