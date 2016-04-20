package test.java.es.uniovi.asw.access;

import main.java.es.uniovi.asw.model.Voter;

public class LoginEVTest {
	
	//registered e-voters who have not voted yet
	private Voter voter1 = new Voter("XXXX", "name1", "email1", "pass1", false, true);
	private Voter voter2 = new Voter("YYYY", "name2", "email2", "pass2", false, true);
	
	//not e-voter
	private Voter voter3 = new Voter("ZZZZ", "name3", "email3", "pass3", false, false);
	
	//has voted
	private Voter voter4 = new Voter("QQQQ", "name4", "email4", "pass4", true, true);
	
	//not registered
	private Voter voter5 = new Voter("WWWW", "name5", "email5", "pass5", false, true);
	
}
