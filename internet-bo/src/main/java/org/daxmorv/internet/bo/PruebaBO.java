package org.daxmorv.internet.bo;

import javax.ejb.Local;
import org.daxmorv.internet.entities.Prueba;

/*
 * @author Eyder Albeiro Ascuntar Rosales
 */

@Local
public interface PruebaBO {

	public boolean pruebaBO(Prueba pr);

}
