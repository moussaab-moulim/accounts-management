package com.moussaab.src.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@DiscriminatorValue("R")
@Data
public class Retrait extends Operations {
	
	public Retrait() {
		super();
		
	}
	public Retrait(Date dateOperation, double montant, Compte compte) {
		super(dateOperation, montant, compte);
		// TODO Auto-generated constructor stub
	}

	
}
