package main.java.es.uniovi.asw.dbUpdate.verifiers;

import main.java.es.uniovi.asw.model.Option;

public class VoteVerifier {

	public void check(Option option) throws IllegalArgumentException{
		
		if(option!=Option.Ciudadanos || option!= Option.PODEMOS 
				||option!=Option.PP || option!=Option.PSOE || option!=Option.nulo
				|| option!=Option.whiteVote){
			throw new IllegalArgumentException("This vote is not allowed in this elections.");
		}
	}
}
