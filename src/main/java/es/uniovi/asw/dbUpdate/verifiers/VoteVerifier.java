package main.java.es.uniovi.asw.dbUpdate.verifiers;

import main.java.es.uniovi.asw.model.Option;
import main.java.es.uniovi.asw.model.Vote;

public class VoteVerifier {

	public static void check(Vote vote) throws IllegalArgumentException{
		
		if(vote.getOption()!=Option.Ciudadanos || vote.getOption()!= Option.PODEMOS 
				||vote.getOption()!=Option.PP || vote.getOption()!=Option.PSOE || vote.getOption()!=Option.nulo
				|| vote.getOption()!=Option.whiteVote){
			throw new IllegalArgumentException("This vote is not allowed in this elections.");
		}
	}
}
