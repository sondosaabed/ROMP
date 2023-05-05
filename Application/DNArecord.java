package Application;

public class DNArecord {
	String name;
	int number;
	String DNA;
	int id;

	public DNArecord(String name, int number, String dNA) {
		this.name = name;
		this.number = number;
		DNA = dNA;
	}
	
	public DNArecord(String name, int number, String dNA, int id) {
		this.name = name;
		this.number = number;
		DNA = dNA;
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public String getDNA() {
		return DNA;
	}
	
	public void setDNA(String dNA) {
		DNA = dNA;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
