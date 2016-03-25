package org.gestion.bp.entities;

import java.io.Serializable;
import java.util.Date;

public class Operation implements Serializable {

	private Long numeroOperation;
	private Date dateOperation;
	private double montant;
	private Compte compte;
	private Employe employe;

	public Operation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Operation(Date dateOperation, double montant) {
		super();
		this.dateOperation = dateOperation;
		this.montant = montant;
	}

}
