package com.moussaab.src.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data  
public class Client implements Serializable {

	@Id @GeneratedValue
	private Long code;
	private String nom;
	
	@OneToMany(mappedBy = "client",fetch = FetchType.LAZY)
	private Collection<Compte> comptes;

	public Client(String nom) {
		super();
		this.nom = nom;
	}

	public Client() {
		super();
		
	}
		
	
}
