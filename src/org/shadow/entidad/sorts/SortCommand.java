package org.shadow.entidad.sorts;

import org.shadow.entidad.Command;

import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * User: BlackShadow
 * Date: 1/21/14
 * Time: 5:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class SortCommand implements Comparator<Command> {

    @Override
    public int compare(Command x1, Command x2) {
        return (int)(x1.getPisoDestino() - x2.getPisoDestino());
    }
}
