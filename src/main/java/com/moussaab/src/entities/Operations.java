package com.moussaab.src.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data 
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE",length = 2)
public abstract class Operations implements Serializable {

	@Id @GeneratedValue
	private Long numero;
	private Date dateOperation;
	private double montant;
	
	@ManyToOne
	@JoinColumn(name = "CODE_CPTE")
	private Compte compte;

	public Operations() {
		super();
	}

	public Operations(Date dateOperation, double montant, Compte compte) {
		super();
		this.dateOperation = dateOperation;
		this.montant = montant;
		this.compte = compte;
	}
	
	
	
}
