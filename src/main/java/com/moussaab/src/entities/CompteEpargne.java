package com.moussaab.src.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("CE")
@Data
public class CompteEpargne extends Compte {

	private double taux;

	public CompteEpargne() {
		super();
	}

	public CompteEpargne(String code, double solde, Date dateCreation, Client client, double taux) {
		super(code, solde, dateCreation, client);
		this.taux = taux;
	}
	
	
	
}
