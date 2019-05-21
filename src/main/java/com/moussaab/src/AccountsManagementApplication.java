package com.moussaab.src;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.moussaab.src.dao.ClientRepository;
import com.moussaab.src.dao.CompteRepository;
import com.moussaab.src.dao.OperationsRepository;
import com.moussaab.src.entities.Client;
import com.moussaab.src.entities.Compte;
import com.moussaab.src.entities.CompteCourant;
import com.moussaab.src.entities.CompteEpargne;
import com.moussaab.src.entities.Retrait;
import com.moussaab.src.entities.Versement;

@SpringBootApplication
public class AccountsManagementApplication implements CommandLineRunner {

	@Autowired
	private ClientRepository clientRepository;
	@Autowired
	private CompteRepository compteRepository;
	@Autowired
	private OperationsRepository operationsRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(AccountsManagementApplication.class, args);
		
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		clientRepository.save(new Client("Hassan"));
		clientRepository.save(new Client("AAAA"));
		
		Optional<Client> c1=clientRepository.findById(1L);
		compteRepository.save( new CompteCourant("c1", 9000, new Date(), c1.get(),800.0));
		compteRepository.save( new CompteEpargne("c2", 7800, new Date(), c1.get(),5.0));
		
		
		Optional<Compte> cp=compteRepository.findById("c1");
		/* * Effectuer des versments et des retraits sur le compte c1 */
		operationsRepository.save(new Versement(new Date(),6000,cp.get()));
		operationsRepository.save(new Versement(new Date(),7000,cp.get()));
		operationsRepository.save(new Retrait(new Date(),5400,cp.get()));
	}

}
