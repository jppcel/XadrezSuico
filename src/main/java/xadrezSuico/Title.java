package xadrezSuico;

public enum Title {
	
	NONE(0, "None", "NONE"),
	GM(1,"Grandmaster", "GM"),
	IM(2,"International Master", "IM"),
	FM(3, "FIDE Master", "FM"),
	CM(4, "Candidate Master", "CM");

	private final int id;
	private String name;
	private String abb;
	
	private Title(int id, String name, String abb){
		this.id = id;
		this.name = name;
		this.abb = abb;
	}
	
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public String getAbb() {
		return abb;
	}
	
	
}
