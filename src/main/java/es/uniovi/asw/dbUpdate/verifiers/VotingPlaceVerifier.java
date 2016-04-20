package main.java.es.uniovi.asw.dbUpdate.verifiers;

import main.java.es.uniovi.asw.model.VotingPlace;

public class VotingPlaceVerifier {
	
	public void verify(VotingPlace votingPlace) throws IllegalArgumentException{
		
		if(votingPlace == null){
			throw new IllegalArgumentException("This voting place does not exist");
		}
	}

}
