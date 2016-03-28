package edu.hm.cs.bikebattle.services;

import edu.hm.cs.bikebattle.domain.User;
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
public class User_EventService {
    // If you need access to the database you can autowire a Repository.
    //
    // @Autowired
    // <EntityName>Repository repo;


    public void onAfterCreate(User entity){
        //Add your Logic here
    }
    public void onBeforeCreate(User entity){
        //Add your Logic here
    }
    public void onBeforeSave(User entity){
        //Add your Logic here
    }
    public void onAfterSave(User entity){
        //Add your Logic here
    }
    public void onBeforeLinkSave(User parent, Object linked){
        //Add your Logic here
    }
    public void onAfterLinkSave(User parent, Object linked){
        //Add your Logic here
    }
    public void onBeforeLinkDelete(User parent, Object linked){
        //Add your Logic here
    }
    public void onBeforeDelete(User entity){
        //Add your Logic here
    }
    public void onAfterDelete(User entity){
        //Add your Logic here
    }
    public void onAfterLinkDelete(User parent, Object linked){
        //Add your Logic here
    }
}
