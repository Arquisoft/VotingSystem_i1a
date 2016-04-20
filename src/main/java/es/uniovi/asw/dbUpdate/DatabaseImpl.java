package main.java.es.uniovi.asw.dbUpdate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import main.java.es.uniovi.asw.dbUpdate.verifiers.VoteVerifier;
import main.java.es.uniovi.asw.dbUpdate.verifiers.VoterVerifier;
import main.java.es.uniovi.asw.model.Vote;
import main.java.es.uniovi.asw.model.Voter;

public class DatabaseImpl {
	
	public Vote insertVote(Vote vote) throws SQLException {
		
		//DriverManager = "org.hsqldb.jdbcDriver";
		
		String url = "jdbc:hsqldb:file:src/main/resources/database/db";
		String username = "SA";
		String password = "";
		
		Connection conn = null;
		PreparedStatement stat = null;
		
		String query = "INSERT INTO votes (option) VALUES(?)";

		VoteVerifier.check(vote);
		
		try {
			conn = DriverManager.getConnection(url,username, password);
			
			stat = conn.prepareStatement(query);
		
			stat.setString(1, vote.getOptionS());
			stat.executeUpdate();
			return vote;
			
		}catch (SQLException e){
			System.err.print("error connecting \n");
			e.printStackTrace();
		}
		
		return vote;
	}
	
	public Voter findVoter(Voter voter) throws SQLException{
		
		//DriverManager = "org.hsqldb.jdbcDriver";
		String url = "jdbc:hsqldb:file:src/main/resources/database/db";
		String username = "SA";
		String password = "";
				
		Connection conn = null;
		PreparedStatement stat = null;
				
		String query = "SELECT nif, nombre, email, password, hasVoted, "
				+ "isEVoter FROM voters  WHERE v.nif ='?'";
	
		VoterVerifier.check(voter);

		try {
			conn = DriverManager.getConnection(url,username, password);
					
			stat = conn.prepareStatement(query);
			
			stat.setString(1, voter.getNif());
			stat.setString(2, voter.getName());
			stat.setString(3, voter.getEmail());
			stat.setString(4, voter.getPassword());
			stat.setBoolean(5, voter.isHasVoted());
			stat.setBoolean(6, voter.isEVoter());
			stat.executeUpdate();
			return voter;
					
		}catch (SQLException e){
			System.err.print("error connecting \n");
			e.printStackTrace();
		}
				
		return voter;
	}
	
	public Voter updateHasVoted(Voter voter) throws SQLException {
		
		//DriverManager = "org.hsqldb.jdbcDriver";
		String url = "jdbc:hsqldb:file:src/main/resources/database/db";
		String username = "SA";
		String password = "";
		
		Connection conn = null;
		PreparedStatement stat = null;
		
		String query = "UPDATE voters SET hasVoted=? WHERE nif=?)";
		
		VoterVerifier.check(voter);

		try {
			conn = DriverManager.getConnection(url,username, password);
			
			stat = conn.prepareStatement(query);
		
			stat.setBoolean(1, voter.isHasVoted());
			stat.setString(2, voter.getNif());
			stat.executeUpdate();
			return voter;
			
		}catch (SQLException e){
			System.err.print("error connecting \n");
			e.printStackTrace();
		}
		
		return voter;
	}
}
