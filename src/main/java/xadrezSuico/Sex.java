package xadrezSuico;

public enum Sex {
	MALE(1, "Masculino"),
	FEMALE(2, "Feminino"),
	INDEFINED(3, "Indefinido");
	
	private final int id;
	private String name;
	
	private Sex(int id, String name){
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
