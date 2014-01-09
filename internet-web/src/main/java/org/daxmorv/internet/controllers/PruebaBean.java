package org.daxmorv.internet.controllers;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Inject;
import javax.inject.Named;

import org.daxmorv.internet.bo.PruebaBO;
import org.daxmorv.internet.entities.Prueba;

/*
 * @author Eyder Albeiro Ascuntar Rosales
 */

@Named
@SessionScoped
public class PruebaBean implements Serializable {

	private static final long serialVersionUID = 6437541572047498821L;
	@Inject
	private PruebaBO pruebaBO;

	private String firstname;

	private String surname;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void savePerson(ActionEvent actionEvent) {
		Prueba pr = new Prueba(firstname, surname);
		if (pruebaBO.pruebaBO(pr) == true) {
			FacesContext.getCurrentInstance().addMessage(
					null,
					new FacesMessage("Bienvenido " + firstname + " " + surname
							+ "!"));
		} else {
			FacesContext.getCurrentInstance().addMessage(
					null,
					new FacesMessage("Error al registrar Usuario  " + firstname
							+ " " + surname + "!"));
		}
	}
}
