package main.java.es.uniovi.asw.access.eVoter;

import java.sql.SQLException;

import main.java.es.uniovi.asw.dbUpdate.Database;
import main.java.es.uniovi.asw.dbUpdate.verifiers.VoterVerifier;
import main.java.es.uniovi.asw.exceptions.ExceptionMessages;
import main.java.es.uniovi.asw.exceptions.InvalidParameterException;
import main.java.es.uniovi.asw.model.Voter;

/**
 * Class to register users that can vote online
 * 
 */
public class Register {
	
	public Voter makeEVoter(Voter voter) throws SQLException, InvalidParameterException{
		
		Database database = new Database();
		
		VoterVerifier.check(voter);
		
		if(voter.isEVoter()){
			throw new InvalidParameterException(ExceptionMessages.ALREADY_EVOTER);
		}
		
		voter.setEVoter(true);
		return database.addNewEVoter(voter);
	}

}
