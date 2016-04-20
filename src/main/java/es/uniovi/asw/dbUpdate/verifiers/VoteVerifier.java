package main.java.es.uniovi.asw.dbUpdate.verifiers;

import main.java.es.uniovi.asw.model.Candidate;

public class VoteVerifier {

	public void check(Candidate candidate) throws IllegalArgumentException{
		
		if(candidate!=Candidate.Ciudadanos || candidate!= Candidate.PODEMOS 
				||candidate!=Candidate.PP || candidate!=Candidate.PSOE){
			throw new IllegalArgumentException("The voted candidate is not allowed in this elections.");
		}
	}
}
