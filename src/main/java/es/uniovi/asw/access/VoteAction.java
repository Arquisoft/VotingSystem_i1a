package main.java.es.uniovi.asw.access;

import java.sql.SQLException;

import main.java.es.uniovi.asw.dbUpdate.Database;
import main.java.es.uniovi.asw.exceptions.InvalidParameterException;
import main.java.es.uniovi.asw.model.Vote;
import main.java.es.uniovi.asw.model.Voter;

public class VoteAction {
	
	public void vote(Vote vote, Voter voter) throws SQLException, InvalidParameterException{
		
		Database database = new Database();
		
		database.insertVote(vote);
		voter.setHasVoted(true);
		database.updateHasVoted(voter);
		
	}

}
