package main.java.es.uniovi.asw.access.eVoter;

import java.sql.SQLException;

import main.java.es.uniovi.asw.dbUpdate.Database;
import main.java.es.uniovi.asw.dbUpdate.verifiers.VoterVerifier;
import main.java.es.uniovi.asw.model.Voter;

/**
 * Class to register users that can vote online
 */
public class Register {
	
	public Voter makeEVoter(Voter voter) throws SQLException, IllegalArgumentException{
		
		Database database = new Database();
		
		VoterVerifier.check(voter);
		
		if(voter.isEVoter()){
			throw new IllegalArgumentException("The voter is already an e-voter");
		}
		
		voter.setEVoter(true);
		return database.addNewEVoter(voter);
	}

}
