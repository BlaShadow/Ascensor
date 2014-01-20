package org.shadow.manager;

import org.shadow.entidad.Command;

/**
 * Created with IntelliJ IDEA.
 * User: BlackShadow
 * Date: 1/18/14
 * Time: 5:44 PM
 * To change this template use File | Settings | File Templates.
 */
public interface IMediator {
    void peticion(Command comando);
}
