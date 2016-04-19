package main.java.es.uniovi.asw.model;

public class Vote {
	
	private Long id;
	
	private boolean counted; 
	
	private boolean white;
	private boolean nulo;
	private Candidate candidate;
	
	private VotingPlace votingPlace;

	public Vote(Long id, boolean counted, boolean white, boolean nulo,
			Candidate candidate, VotingPlace votingPlace) {
		this.id = id;
		this.counted = counted;
		this.white = white;
		this.nulo = nulo;
		this.candidate = candidate;
		this.votingPlace = votingPlace;
	}

	public boolean isCounted() {
		return counted;
	}

	public void setCounted(boolean counted) {
		this.counted = counted;
	}

	public boolean isWhite() {
		return white;
	}

	public void setWhite(boolean white) {
		this.white = white;
	}

	public boolean isNulo() {
		return nulo;
	}

	public void setNulo(boolean nulo) {
		this.nulo = nulo;
	}

	public Candidate getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	public VotingPlace getVotingPlace() {
		return votingPlace;
	}

	public void setVotingPlace(VotingPlace votingPlace) {
		this.votingPlace = votingPlace;
	}

	public Long getId() {
		return id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (counted ? 1231 : 1237);
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + (nulo ? 1231 : 1237);
		result = prime * result + (white ? 1231 : 1237);
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
		Vote other = (Vote) obj;
		if (counted != other.counted)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nulo != other.nulo)
			return false;
		if (white != other.white)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Vote [id=" + id + ", counted=" + counted + ", white=" + white
				+ ", nulo=" + nulo + "]";
	}
}
