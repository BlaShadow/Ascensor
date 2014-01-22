package org.shadow.manager.filtros;

import org.shadow.entidad.Ascensor;
import org.shadow.entidad.Direccion;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: BlackShadow
 * Date: 1/21/14
 * Time: 2:41 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Filtro {
    protected List<Ascensor> ascensores = null;

    public Filtro(List<Ascensor> ascensores){
        this.ascensores = ascensores;
    }

    public abstract List<Ascensor> getAscensorDisponible();
    public abstract List<Ascensor> getAscensorDisponible(Direccion direccion);
}
