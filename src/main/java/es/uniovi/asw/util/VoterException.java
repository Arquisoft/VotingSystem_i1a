package main.java.es.uniovi.asw.util;

public class VoterException extends Exception {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public VoterException() {
		
	}

	public VoterException(String message) {
		super(message);
	}

	public VoterException(Throwable cause) {
		super(cause);
	}

	public VoterException(String message, Throwable cause) {
		super(message, cause);
	}
}
