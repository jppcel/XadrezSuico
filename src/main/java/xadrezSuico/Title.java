package xadrezSuico;

public enum Title {
	
	GM(1,"Grandmaster"),
	IM(2,"International Master"),
	FM(3, "FIDE Master"),
	CM(4, "Candidate Master");

	private final int id;
	private String name;
	
	private Title(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	
	
}
