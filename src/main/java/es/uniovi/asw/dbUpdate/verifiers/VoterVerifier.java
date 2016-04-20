package main.java.es.uniovi.asw.dbUpdate.verifiers;

import main.java.es.uniovi.asw.model.Voter;

public class VoterVerifier {
	
	public static void check(Voter voter){
		
		if(voter == null){
			throw new IllegalArgumentException("This voter does not exist");
		}

		if(voter.getName() == null || voter.getName().equals("Voter must have name")){
			throw new IllegalArgumentException();
		}
		
		if(voter.getNif() == null || voter.getNif().equals("Voter musut have nif")){
			throw new IllegalArgumentException();
		}
	}
}
