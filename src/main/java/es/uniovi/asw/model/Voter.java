package main.java.es.uniovi.asw.model;

public class Voter {
	
	private Long id; //identifier of the user
	private String name; //name of the user
	private String email; 
	private String nif; 
	private String password;  //password to access the system
	private boolean hasVoted; //boolean to store if the person has already voted or not
	private boolean isEVoter; //boolean to know if the voter can vote online 
	
	
	public Voter(){
		
	}

	public Voter(Long id, String name, String email, String nif,
			String password, boolean hasVoted, boolean isEVoter) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.nif = nif;
		this.password = password;
		this.hasVoted = hasVoted;
		this.isEVoter = isEVoter;
	}

	public Voter(String nif, String name, String email, String password, boolean hasVoted, boolean isEVoter){
		this.nif = nif;
		this.name = name;
		this.email = email;
		this.password = password;
		this.hasVoted = hasVoted;
		this.isEVoter = isEVoter;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getNif() {
		return nif;
	}


	public void setNif(String nif) {
		this.nif = nif;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public boolean isHasVoted() {
		return hasVoted;
	}


	public void setHasVoted(boolean hasVoted) {
		this.hasVoted = hasVoted;
	}


	public boolean isEVoter() {
		return isEVoter;
	}


	public void setEVoter(boolean isEVoter) {
		this.isEVoter = isEVoter;
	}


	public Long getId() {
		return id;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + (hasVoted ? 1231 : 1237);
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + (isEVoter ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((nif == null) ? 0 : nif.hashCode());
		result = prime * result
				+ ((password == null) ? 0 : password.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Voter other = (Voter) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (hasVoted != other.hasVoted)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (isEVoter != other.isEVoter)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (nif == null) {
			if (other.nif != null)
				return false;
		} else if (!nif.equals(other.nif))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Voter [id=" + id + ", name=" + name + ", email=" + email
				+ ", nif=" + nif + ", password=" + password + ", hasVoted="
				+ hasVoted + ", isEVoter=" + isEVoter + "]";
	}
	
	
}
