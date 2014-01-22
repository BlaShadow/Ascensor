package org.shadow.manager.factory;

import org.shadow.manager.SistemaManager;

/**
 * Created with IntelliJ IDEA.
 * User: BlackShadow
 * Date: 1/21/14
 * Time: 1:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class ManagerFactory {

    private static SistemaManager manager = null;

    public static SistemaManager getManager(){
        if(manager == null){
            manager = new SistemaManager();
        }

        return manager;
    }
}
