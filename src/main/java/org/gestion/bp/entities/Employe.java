package org.gestion.bp.entities;

import java.io.Serializable;
import java.util.Collection;

public class Employe implements Serializable {

	private Long codeEmploye;
	private String nomEmploye;
	private Employe employeSup;
	private Collection<Groupe> groupes;

	public Employe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employe(String nomEmploye) {
		super();
		this.nomEmploye = nomEmploye;
	}

	public Employe(String nomEmploye, Employe employeSup) {
		super();
		this.nomEmploye = nomEmploye;
		this.employeSup = employeSup;
	}

	public Long getCodeEmploye() {
		return codeEmploye;
	}

	public void setCodeEmploye(Long codeEmploye) {
		this.codeEmploye = codeEmploye;
	}

	public String getNomEmploye() {
		return nomEmploye;
	}

	public void setNomEmploye(String nomEmploye) {
		this.nomEmploye = nomEmploye;
	}

	public Employe getEmployeSup() {
		return employeSup;
	}

	public void setEmployeSup(Employe employeSup) {
		this.employeSup = employeSup;
	}

	public Collection<Groupe> getGroupes() {
		return groupes;
	}

	public void setGroupes(Collection<Groupe> groupes) {
		this.groupes = groupes;
	}

}
