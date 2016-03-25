package org.gestion.bp.entities;

import java.io.Serializable;
import java.util.Collection;

public class Groupe implements Serializable {

	private Long codeGroupe;
	private String nomGroupe;
	private Collection<Employe> employes;

	public Groupe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Groupe(String nomGroupe) {
		super();
		this.nomGroupe = nomGroupe;
	}

}
