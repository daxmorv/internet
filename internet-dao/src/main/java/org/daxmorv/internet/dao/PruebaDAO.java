package org.daxmorv.internet.dao;

import javax.ejb.Local;

import org.daxmorv.internet.entities.Prueba;

/*
 * @author Eyder Albeiro Ascuntar Rosales
 */

@Local
public interface PruebaDAO {

	public boolean pruebaDAO(Prueba pr);

}
