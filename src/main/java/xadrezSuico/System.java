package xadrezSuico;

public enum System {
	
	SWISS(1, "Suíço"),
	ROUND_ROBIN(2, "Round Robin");
	
	private int id;
	private String name;
	
	private System(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public int getId(){
		return this.id;
	}
	
	public String getName(){
		return this.name;
	}
}