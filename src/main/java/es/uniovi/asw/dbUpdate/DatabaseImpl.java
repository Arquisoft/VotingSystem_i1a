package main.java.es.uniovi.asw.dbUpdate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import main.java.es.uniovi.asw.model.Vote;
import main.java.es.uniovi.asw.model.Voter;

public class DatabaseImpl {
	
	public Vote insertVote(Vote vote) throws SQLException {
		
		DriverManager = org.hsqldb.jdbcDriver;
		String url = "jdbc:hsqldb:hsql://localhost";
		String username = "SA";
		String password = "";
		
		Connection conn = null;
		PreparedStatement stat = null;
		
		String query = INSERT INTO votos (opcion) VALUES(?);

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
			
	}
	public Voter updateHasVoted(Voter voter) throws SQLException {
		Connection con = null;
		PreparedStatement stat = null;
		
		try{
			con = JdbcHelper.getConnection();
			stat = con.prepareStatement(JdbcHelper.getQueries().getProperty("UPDATE_HAS_VOTED"));
			stat.setBoolean(1, voter.getHasVoted());
			stat.setString(2, voter.getNif());
			stat.executeUpdate();
			return voter;
		} finally {
			JdbcHelper.close(con, stat);
		}
	}

			
	
	/**
	 * 	public static void exercise4(String ciudadConcesionario, String color) throws SQLException {
		
		StringBuilder str = new StringBuilder();
		
		String sentence = "SELECT DISTINCT CL.nombre FROM clientes CL, ventas V" +
						  " WHERE V.dni=CL.dni AND CL.dni NOT IN (SELECT V.dni FROM concesionarios CO, ventas V" + 
						  " WHERE CO.cifc=V.cifc AND CO.ciudadc=? AND V.color=? ";
		

		PreparedStatement stat = conn.prepareStatement(sentence);
		stat.setString(1, ciudadConcesionario);
		stat.setString(2, color);
		
		ResultSet rs = stat.executeQuery();
		
		System.out.print("query 24:\n");
		
		while (rs.next()){
			String nombre = rs.getString("NOMBRE");
			str.append("nombre: " + nombre);
			str.append("\n");
			
			
		}
		System.out.print(str.toString());
		
		rs.close();
		stat.close();
		
	}
	 */
}
