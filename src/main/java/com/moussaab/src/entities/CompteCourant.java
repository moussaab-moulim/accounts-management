package com.moussaab.src.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("CC")
@Data 
public class CompteCourant extends Compte {

	private double decouverte;

	public CompteCourant(String code, double solde, Date dateCreation, Client client, double decouverte) {
		super(code, solde, dateCreation, client);
		this.decouverte = decouverte;
	}
	public CompteCourant() {
		super();
	
	}
	
}
