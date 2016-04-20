package main.java.es.uniovi.asw.dbUpdate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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

		try {
			conn = DriverManager.getConnection(url,username, password);
			
			stat = conn.prepareStatement(query);
		
			stat.setString(1, vote.getOption());
			stat.executeUpdate();
			return vote;
			
		}catch (SQLException e){
			System.err.print("error connecting \n");
			e.printStackTrace();
		}
		
		return vote;
	}
	public Voter updateHasVoted(Voter voter) throws SQLException {
		//DriverManager = "org.hsqldb.jdbcDriver";
		String url = "jdbc:hsqldb:hsql://localhost";
		String username = "SA";
		String password = "";
		
		Connection conn = null;
		PreparedStatement stat = null;
		
		String query = "UPDATE voter SET hasVoted=? WHERE nif=?)";

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
